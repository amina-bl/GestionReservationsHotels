package ma.project.api.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.*;
import ma.project.api.entities.Reservation;
import ma.project.api.repositories.ChambreRepository;
import ma.project.api.repositories.ClientRepository;
import ma.project.api.repositories.ReservationRepository;
import ma.projet.api.stubs.*;
import ma.projet.api.stubs.ReservationServiceGrpc.ReservationServiceImplBase;
import net.devh.boot.grpc.server.service.GrpcService;
import ma.project.api.entities.Client;

@GrpcService
public class ReservationServiceImpl extends ReservationServiceImplBase {

    @Autowired
    private ReservationRepository reservationRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ChambreRepository chambreRepository;

    @Override
    public void deleteReservation(DeleteReservationRequest request, StreamObserver<DeleteReservationResponse> responseObserver) {
        try {
            Long id = Long.parseLong(request.getId());
            Optional<Reservation> optionalReservation = reservationRepository.findById(id);

            if (optionalReservation.isPresent()) {
                reservationRepository.delete(optionalReservation.get());
                responseObserver.onNext(DeleteReservationResponse.newBuilder().setSuccess(true).build());
            } else {
                responseObserver.onError(new Throwable("Reservation with ID " + id + " not found."));
            }
            responseObserver.onCompleted();
        } catch (NumberFormatException e) {
            responseObserver.onError(new Throwable("Invalid ID format. ID must be a number."));
        } catch (Exception e) {
            responseObserver.onError(new Throwable("An unexpected error occurred: " + e.getMessage()));
        }
    }

  
    @Override
    public void allReservations(GetAllReservationsRequest request, StreamObserver<GetAllReservationsResponse> responseObserver) {
        try {
            List<Reservation> reservations = reservationRepository.findAll();
            GetAllReservationsResponse.Builder responseBuilder = GetAllReservationsResponse.newBuilder();

            for (Reservation reservation : reservations) {
                responseBuilder.addReservations(mapToGrpcReservation(reservation));
            }

            responseObserver.onNext(responseBuilder.build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(new Throwable("An unexpected error occurred: " + e.getMessage()));
        }
    }

    @Override
    public void reservationById(GetReservationByIdRequest request, StreamObserver<GetReservationByIdResponse> responseObserver) {
        try {
            Long id = Long.parseLong(request.getId());
            Optional<Reservation> optionalCompte = reservationRepository.findById(id);

            if (optionalCompte.isPresent()) {
                responseObserver.onNext(GetReservationByIdResponse.newBuilder()
                        .setReservation(mapToGrpcReservation(optionalCompte.get()))
                        .build());
            } else {
                responseObserver.onError(new Throwable("Reservation with ID " + id + " not found."));
            }
            responseObserver.onCompleted();
        } catch (NumberFormatException e) {
            responseObserver.onError(new Throwable("Invalid ID format. ID must be a number."));
        } catch (Exception e) {
            responseObserver.onError(new Throwable("An unexpected error occurred: " + e.getMessage()));
        }
    }

    

    @Override
    public void saveReservation(SaveReservationRequest request, StreamObserver<SaveReservationResponse> responseObserver) {
        try {
            ReservationRequest reservationReq = request.getReservation();
            System.out.println("Received reservation request: " + reservationReq);

            // Validate inputs
            if (reservationReq.getChambreId() == null || reservationReq.getChambreId().isEmpty()) {
                throw Status.INVALID_ARGUMENT.withDescription("Chambre ID is required and cannot be empty.").asRuntimeException();
            }
            if (reservationReq.getClientId() == null || reservationReq.getClientId().isEmpty()) {
                throw Status.INVALID_ARGUMENT.withDescription("Client ID is required and cannot be empty.").asRuntimeException();
            }

            Long idChambre = Long.parseLong(reservationReq.getChambreId());
            Long idClient = Long.parseLong(reservationReq.getClientId());

            // Fetch related entities
            Client client = clientRepository.findById(idClient)
                    .orElseThrow(() -> Status.NOT_FOUND.withDescription("Client not found").asRuntimeException());
            ma.project.api.entities.Chambre chambre = chambreRepository.findById(idChambre)
                    .orElseThrow(() -> Status.NOT_FOUND.withDescription("Chambre not found").asRuntimeException());

            // Parse and save the reservation
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy");
            Reservation newReservation = new Reservation();
            newReservation.setPreferences(reservationReq.getPreferences());
            newReservation.setDateDebut(simpleDateFormat.parse(reservationReq.getDateDebut()));
            newReservation.setDateFin(simpleDateFormat.parse(reservationReq.getDateFin()));
            newReservation.setChambre(chambre);
            newReservation.setClient(client);

            Reservation savedReservation = reservationRepository.save(newReservation);

            responseObserver.onNext(SaveReservationResponse.newBuilder()
                    .setReservation(mapToGrpcReservation(savedReservation))
                    .build());
            responseObserver.onCompleted();

        } catch (NumberFormatException e) {
            responseObserver.onError(Status.INVALID_ARGUMENT
                    .withDescription("Invalid ID format: " + e.getMessage())
                    .asRuntimeException());
        } catch (ParseException e) {
            responseObserver.onError(Status.INVALID_ARGUMENT
                    .withDescription("Invalid date format. Expected format is MM-dd-yyyy.")
                    .asRuntimeException());
        } catch (StatusRuntimeException e) {
            responseObserver.onError(e);
        } catch (Exception e) {
            responseObserver.onError(Status.INTERNAL
                    .withDescription("An unexpected error occurred: " + e.getMessage())
                    .asRuntimeException());
        }
    }



    // Utility function to map JPA entity to gRPC Compte
    private ma.projet.api.stubs.Reservation mapToGrpcReservation(ma.project.api.entities.Reservation reservation) {
        ma.projet.api.stubs.Client grpcClient = ma.projet.api.stubs.Client.newBuilder()
            .setId(String.valueOf(reservation.getClient().getId()))
            .setNom(reservation.getClient().getNom())
            .setPrenom(reservation.getClient().getPrenom())
            .setEmail(reservation.getClient().getEmail())
            .setTelephone(reservation.getClient().getTelephone())
            .build();

        ma.projet.api.stubs.Chambre grpcChambre = ma.projet.api.stubs.Chambre.newBuilder()
            .setId(String.valueOf(reservation.getChambre().getId()))
            .setType(ma.projet.api.stubs.TypeChambre.valueOf(reservation.getChambre().getType().name()))
            .setPrix((float)reservation.getChambre().getPrix())
            .setDisponible(reservation.getChambre().isDisponible())
            .build();

        return ma.projet.api.stubs.Reservation.newBuilder()
            .setId(String.valueOf(reservation.getId()))
            .setDateDebut(reservation.getDateDebut().toString())
            .setDateFin(reservation.getDateFin().toString())
            .setPreferences(reservation.getPreferences())
            .setClient(grpcClient)
            .setChambre(grpcChambre)
            .build();
    }

}

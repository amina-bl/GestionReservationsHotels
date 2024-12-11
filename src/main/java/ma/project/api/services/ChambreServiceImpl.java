package ma.project.api.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import io.grpc.stub.StreamObserver;
import ma.project.api.repositories.ChambreRepository;
import ma.projet.api.stubs.*;
import ma.projet.api.stubs.ChambreServiceGrpc.ChambreServiceImplBase;
import net.devh.boot.grpc.server.service.GrpcService;
import ma.project.api.entities.Chambre;

@GrpcService
public class ChambreServiceImpl extends ChambreServiceImplBase{

    @Autowired
    private ChambreRepository chambreRepository;

    @Override
    public void deleteChambre(DeleteChambreRequest request, StreamObserver<DeleteChambreResponse> responseObserver) {
        try {
            Long id = Long.parseLong(request.getId());
            Optional<ma.project.api.entities.Chambre> optionalChambre = chambreRepository.findById(id);

            if (optionalChambre.isPresent()) {
                chambreRepository.delete(optionalChambre.get());
                responseObserver.onNext(DeleteChambreResponse.newBuilder().setSuccess(true).build());
            } else {
                responseObserver.onError(new Throwable("Compte with ID " + id + " not found."));
            }
            responseObserver.onCompleted();
        } catch (NumberFormatException e) {
            responseObserver.onError(new Throwable("Invalid ID format. ID must be a number."));
        } catch (Exception e) {
            responseObserver.onError(new Throwable("An unexpected error occurred: " + e.getMessage()));
        }
    }

    @Override
    public void allChambres(GetAllChambresRequest request, StreamObserver<GetAllChambresResponse> responseObserver) {
        try {
            List<ma.project.api.entities.Chambre> chambres = chambreRepository.findAll();
            GetAllChambresResponse.Builder responseBuilder = GetAllChambresResponse.newBuilder();

            for (Chambre chambre : chambres) {
                responseBuilder.addChambres(mapToGrpcChambre(chambre));
            }

            responseObserver.onNext(responseBuilder.build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(new Throwable("An unexpected error occurred: " + e.getMessage()));
        }
    }

    @Override
    public void chambreById(GetChambreByIdRequest request, StreamObserver<GetChambreByIdResponse> responseObserver) {
        try {
            Long id = Long.parseLong(request.getId());
            Optional<ma.project.api.entities.Chambre> optionalChambre = chambreRepository.findById(id);

            if (optionalChambre.isPresent()) {
                responseObserver.onNext(GetChambreByIdResponse.newBuilder()
                        .setChambre(mapToGrpcChambre(optionalChambre.get()))
                        .build());
            } else {
                responseObserver.onError(new Throwable("Compte with ID " + id + " not found."));
            }
            responseObserver.onCompleted();
        } catch (NumberFormatException e) {
            responseObserver.onError(new Throwable("Invalid ID format. ID must be a number."));
        } catch (Exception e) {
            responseObserver.onError(new Throwable("An unexpected error occurred: " + e.getMessage()));
        }
    }

    @Override
    public void saveChambre(SaveChambreRequest request, StreamObserver<SaveChambreResponse> responseObserver) {
        ChambreRequest chambreReq = request.getChambre();


        Chambre newChambre = new ma.project.api.entities.Chambre();
       newChambre.setDisponible(chambreReq.getDisponible());
       newChambre.setPrix((double) chambreReq.getPrix());

            // Parse date
            newChambre.setType(chambreReq.getType().getNumber() == 0 ?
                    ma.project.api.entities.TypeChambre.DOUBLE : ma.project.api.entities.TypeChambre.SIMPLE);

            // Save the entity
            Chambre savedChambre = chambreRepository.save(newChambre);

            // Map back to gRPC Compte
            responseObserver.onNext(SaveChambreResponse.newBuilder()
                    .setChambre(mapToGrpcChambre(savedChambre))
                    .build());
            responseObserver.onCompleted();
       
    }

    // Utility function to map JPA entity to gRPC Compte
    private ma.projet.api.stubs.Chambre mapToGrpcChambre(Chambre chambre) {
        ma.projet.api.stubs.TypeChambre type = chambre.getType() == ma.project.api.entities.TypeChambre.DOUBLE ?
                ma.projet.api.stubs.TypeChambre.DOUBLE : ma.projet.api.stubs.TypeChambre.SIMPLE;
        return ma.projet.api.stubs.Chambre.newBuilder()
                .setId(String.valueOf(chambre.getId()))
                .setType(type)
                .setPrix((float) chambre.getPrix())
                .setDisponible((boolean) chambre.isDisponible())
                .build();
}
}

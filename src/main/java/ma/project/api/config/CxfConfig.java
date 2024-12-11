package ma.project.api.config;

import lombok.NoArgsConstructor;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import ma.project.api.ws.ChambreSoapService;
import ma.project.api.ws.ClientSoapService;
import ma.project.api.ws.ReservationSoapService;
import ma.project.api.ws.UtilisateurSoapService;

@Configuration
@NoArgsConstructor
public class CxfConfig {


    private  Bus bus;
    private  ClientSoapService clientSoapService;
    private  ChambreSoapService chambreSoapService;
    private  ReservationSoapService reservationSoapService;
    private  UtilisateurSoapService utilisateurSoapService;

    public CxfConfig(Bus bus, ClientSoapService clientSoapService, ChambreSoapService chambreSoapService,
                     ReservationSoapService reservationSoapService, UtilisateurSoapService utilisateurSoapService) {
        this.bus = bus;
        this.clientSoapService = clientSoapService;
        this.chambreSoapService = chambreSoapService;
        this.reservationSoapService = reservationSoapService;
        this.utilisateurSoapService = utilisateurSoapService;
    }
    @Bean
    public Bus cxfBus() {
        return new SpringBus();
    }
    @Bean
    public EndpointImpl clientEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, clientSoapService);
        endpoint.publish("/client"); // L'URL sera /ws/client
        return endpoint;
    }

    @Bean
    public EndpointImpl chambreEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, chambreSoapService);
        endpoint.publish("/chambre"); // L'URL sera /ws/chambre
        return endpoint;
    }

    @Bean
    public EndpointImpl reservationEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, reservationSoapService);
        endpoint.publish("/reservation"); // L'URL sera /ws/reservation
        return endpoint;
    }

    @Bean
    public EndpointImpl utilisateurEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, utilisateurSoapService);
        endpoint.publish("/utilisateur"); // L'URL sera /ws/utilisateur
        return endpoint;
    }
}

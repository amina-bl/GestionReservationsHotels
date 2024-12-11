package ma.project.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ma.project.api")
public class GestionReservationsHotelsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionReservationsHotelsApplication.class, args);
	}

}

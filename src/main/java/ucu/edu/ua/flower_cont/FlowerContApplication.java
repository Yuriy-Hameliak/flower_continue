package ucu.edu.ua.flower_cont;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FlowerContApplication {
	public static void main(String[] args) {
		SpringApplication.run(FlowerContApplication.class, args);
	}
}

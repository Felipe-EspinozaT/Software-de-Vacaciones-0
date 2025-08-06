package fina.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("fina.demo.Repository")
public class EspinozaFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(EspinozaFinalApplication.class, args);
		System.out.println("/t Nice supuestamente----");
	}

}

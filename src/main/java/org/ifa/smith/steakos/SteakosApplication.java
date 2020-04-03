package org.ifa.smith.steakos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SteakosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SteakosApplication.class, args);
	}

}

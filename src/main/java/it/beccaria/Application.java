package it.beccaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

import it.beccaria.repository.BeccariaJpaRepositoryImpl;

@SpringBootApplication
@EnableScheduling
@EnableJpaRepositories(repositoryBaseClass = BeccariaJpaRepositoryImpl.class)
public class Application extends SpringBootServletInitializer {

	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

package com.gamesaved.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GamesavedBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GamesavedBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}

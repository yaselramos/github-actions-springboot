package com.latecnologiaavanza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiRestSpringbootApplication {

	@GetMapping("/saludo")
	public String saludar(){
		return "Hola, suscríbete a La Tecnología Avanza !!!!!";
	}

	@GetMapping("/saludos")
	public String saludarNuevo(){
		return "Comparte este video en tu Linkedin !!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiRestSpringbootApplication.class, args);
	}

}

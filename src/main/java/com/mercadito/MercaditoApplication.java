package com.mercadito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;

@SpringBootApplication
@ComponentScan("com.mercadito")

public class MercaditoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MercaditoApplication.class, args);
	}

}

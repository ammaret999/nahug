package com.appman.nahug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
public class NahugApplication {

	public static void main(String[] args) {
		SpringApplication.run(NahugApplication.class, args);
	}

}

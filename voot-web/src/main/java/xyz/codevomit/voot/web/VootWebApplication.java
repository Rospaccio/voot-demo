package xyz.codevomit.voot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class VootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(VootWebApplication.class, args);
	}

}

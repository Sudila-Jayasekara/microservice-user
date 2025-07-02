package com.sudila.microservice_user;

import com.sudila.microservice_user.auth.AuthenticationService;
import com.sudila.microservice_user.auth.RegisterRequest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.sudila.microservice_user.user.Role.*;

@SpringBootApplication
public class MicroserviceUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceUserApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(
//			AuthenticationService service
//	) {
//		return args -> {
//			var admin = RegisterRequest.builder()
//					.firstname("Admin")
//					.lastname("User")
//					.email("admin@mail.com")
//					.password("password")
//					.role(ADMIN)
//					.build();
//			System.out.println("Admin token: " + service.register(admin).getAccessToken());
//
//			var manager = RegisterRequest.builder()
//					.firstname("Manager")
//					.lastname("User")
//					.email("manager@mail.com")
//					.password("password")
//					.role(MANAGER)
//					.build();
//			System.out.println("Manager token: " + service.register(manager).getAccessToken());
//
//			var user = RegisterRequest.builder()
//					.firstname("Regular")
//					.lastname("User")
//					.email("user@mail.com")
//					.password("password")
//					.role(USER)
//					.build();
//			System.out.println("User token: " + service.register(user).getAccessToken());
//		};
//	}
}
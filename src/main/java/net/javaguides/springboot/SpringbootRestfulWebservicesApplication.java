package net.javaguides.springboot;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
	info = @Info(
			title = "Springboot REST API DOC",
			description = "Spring Boot REST API DOCUMENTATION",
			version = "v1.0",
			contact = @Contact(
					name = "Siddharth",
					email = "sidh@gmail.com"
			),
			license = @License(
					name = "Appache 2.0",
					url = "my object"
			)

	),
		externalDocs = @ExternalDocumentation(
				description = "Springboot User Managemnt Doc",
				url = "http://usl.com"
		)
		)
public class SpringbootRestfulWebservicesApplication {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestfulWebservicesApplication.class, args);
	}

}

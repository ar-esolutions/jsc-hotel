package com.esolutions.trainings.jsc2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableConfigurationProperties(LiquibaseProperties.class)
@EnableSwagger2
public class Jsc2App {
	public static void main(String[] args) {
		SpringApplication.run(Jsc2App.class, args);
	}

	@Bean
	public Docket api() {
		final ApiInfo apiInfo = new ApiInfoBuilder()
				.title("ESolutions  Java Starters Challenge v2")
				.description("Desafío de programación Java basado en dominio de \"Have a nice day Hotel\"")
				.version("2.0")
				.contact(new Contact("ESolutions", "http://www.esolutions.com.ar", "rrhh@esolutions.com.ar"))
				.build();
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.ant("/matches/*"))
				.build();
	}
}

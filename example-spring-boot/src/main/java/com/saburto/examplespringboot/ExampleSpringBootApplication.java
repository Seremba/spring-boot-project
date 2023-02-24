package com.saburto.examplespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Here < -- Magic of Spring-boot:
// - configure every `AutoConfiguration` in spring
// if we add this in pom.xml
// <dependency>
// 	<groupId>org.springframework.boot</groupId>
// 	<artifactId>spring-boot-starter-web</artifactId> // < This jar contains a AutoConfigureXXXX.java
// </dependency>
//                            ^ Support Controller RestController, http, json parser, ... etc.

public class ExampleSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleSpringBootApplication.class, args);
		// You can see me!?
	}

}

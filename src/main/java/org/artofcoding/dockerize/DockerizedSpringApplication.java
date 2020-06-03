package org.artofcoding.dockerize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = "org.artofcoding.dockerize")
@EntityScan(basePackages = "org.artofcoding.dockerize.entities")
@EnableSwagger2
@EnableAutoConfiguration
public class DockerizedSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerizedSpringApplication.class, args);
	}

}

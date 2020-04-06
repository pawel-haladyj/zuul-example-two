package pl.haladyj.h2dbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class H2DbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2DbServiceApplication.class, args);
	}

}

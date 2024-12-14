package com.foodies.foodiesBackendImplementation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(exclude = {
    org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class
})

public class FoodiesBackendImplementationApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodiesBackendImplementationApplication.class, args);
	}

}

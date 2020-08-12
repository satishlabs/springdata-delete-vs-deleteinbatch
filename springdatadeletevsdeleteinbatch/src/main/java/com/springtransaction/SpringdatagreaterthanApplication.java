package com.springtransaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;



@SpringBootApplication(scanBasePackages={"com.springtransaction"})
@EntityScan("com.springtransaction.*") 
public class SpringdatagreaterthanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatagreaterthanApplication.class, args);
	}

}

/**
 * 
 */
package com.example.contract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

/**
 * @author jarodriguez
 *
 */
@Profile("test")
@SpringBootApplication
public class CustomerApplicationTest {
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerApplicationTest.class, args);
	}

}

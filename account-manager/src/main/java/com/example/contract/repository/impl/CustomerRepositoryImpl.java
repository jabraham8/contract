///**
// * 
// */
//package com.example.contract.repository.impl;
//
//import static org.springframework.http.MediaType.APPLICATION_JSON;
//import static org.springframework.http.RequestEntity.post;
//
//import java.net.URI;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.RequestEntity;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Repository;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.util.UriComponentsBuilder;
//
//import com.example.contract.model.Customer;
//import com.example.contract.repository.CustomerRepository;
//
///**
// * @author jarodriguez
// *
// */
//@Repository
//public class CustomerRepositoryImpl implements CustomerRepository {
//	
//	private RestTemplate restTemplate = new RestTemplate();
//	
//	@Value("${microservice.customer.host}")
//	private String customerHost;
//	
//	public Customer save(Customer customer) {
//		
//		URI uri = UriComponentsBuilder
//			.fromHttpUrl(customerHost)
//			.path("/customer")
//			.build(true).toUri();
//		
//		RequestEntity<Customer> request = 
//			post(uri)
//			.accept(APPLICATION_JSON).contentType(APPLICATION_JSON)
//			.body(customer);
//		
//		ResponseEntity<Customer> result = restTemplate.exchange(request, Customer.class);
//		
//		return result.getBody();
//	}
//}

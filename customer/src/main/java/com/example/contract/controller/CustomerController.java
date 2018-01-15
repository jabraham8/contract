/**
 * 
 */
package com.example.contract.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.contract.model.Customer;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author jarodriguez
 *
 */
@RestController
@RequestMapping("/customer")
@Api(value = "Customer API", tags = {"customer"})
public class CustomerController {

	
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
	
	@PostMapping(consumes = {APPLICATION_JSON_VALUE}, produces = {APPLICATION_JSON_VALUE})
	@ApiOperation(value = "Create a new Customer",
			notes = "Creates a new Customer verifying its data and that it doesn't already exists")
	@ApiResponses({
		@ApiResponse(code = HttpStatus.SC_INTERNAL_SERVER_ERROR, message = "There was an error"),
		@ApiResponse(code = HttpStatus.SC_CONFLICT, message = "The customer already exists")
	})
	@ResponseBody
	@ResponseStatus(org.springframework.http.HttpStatus.CREATED)
	public Customer createCustomer(@RequestBody Customer customer) {
		
		LOGGER.info("POST -> /customer. Body : {}", customer);
		
		return customer;
	}
}

/**
 * 
 */
package com.example.contract.controller;

import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author jarodriguez
 *
 */
@RestController
@RequestMapping("/test")
@Api(value = "Hello world test API", tags = {"hello world"})
public class HelloWorldController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);
	
	@GetMapping("/helloWorld")
	@ApiOperation(value = "Greet the world",
		notes = "Tests the API by returning the well-known hello world message")
	@ApiResponses({
		@ApiResponse(code = HttpStatus.SC_INTERNAL_SERVER_ERROR , message = "There was an error")
	})
	public String helloWorld() {
		
		LOGGER.info("GET -> /test/helloWorld");
		
		return "Hello World!";
	}
	
	@GetMapping("/hello/{name}")
	@ApiOperation(value = "Greet the client",
		notes = "Tests the parameterized API by saluting the client")
	@ApiResponses({
		@ApiResponse(code = HttpStatus.SC_INTERNAL_SERVER_ERROR , message = "There was an error")
	})
	public String hello(@ApiParam(value = "Your name", type = "String" )@PathVariable String name) {
		
		LOGGER.info("GET -> /test/hello/{name={}}", name);
		
		return new StringBuilder("Hello ").append(name).append("!").toString();
	}
}

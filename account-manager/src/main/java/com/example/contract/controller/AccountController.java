///**
// * 
// */
//package com.example.contract.controller;
//
//import static org.apache.http.HttpStatus.SC_INTERNAL_SERVER_ERROR;
//import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.contract.model.Account;
//import com.example.contract.service.AccountService;
//
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiResponse;
//import io.swagger.annotations.ApiResponses;
//
///**
// * @author jarodriguez
// *
// */
//@RestController
//@RequestMapping("/account")
//@Api(value = "Accounts API", tags = {"account"})
//public class AccountController {
//	
//	private static final Logger LOGGER = LoggerFactory.getLogger(AccountController.class);
//	
//	@Autowired
//	private AccountService accountService;
//	
//	@PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE, produces = APPLICATION_JSON_UTF8_VALUE)
//	@ApiOperation(value = "Create an account", notes = "Creates an account with all of its associated elements like "
//			+ "customer, security configurations, personal settings")
//	@ApiResponses({
//		@ApiResponse(code = SC_INTERNAL_SERVER_ERROR , message = "There was an error")
//	})
//	@ResponseStatus(org.springframework.http.HttpStatus.CREATED)
//	public Account createAccount(@RequestBody Account account) {
//		
//		LOGGER.info("POST -> /account. Body: {}", account);
//		
//		return accountService.createAccount(account);
//	}
//}

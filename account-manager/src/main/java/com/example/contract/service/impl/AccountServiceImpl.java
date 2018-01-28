///**
// * 
// */
//package com.example.contract.service.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.contract.model.Account;
//import com.example.contract.model.Customer;
//import com.example.contract.repository.CustomerRepository;
//import com.example.contract.service.AccountService;
//
///**
// * @author jarodriguez
// *
// */
//@Service
//public class AccountServiceImpl implements AccountService {
//
//	@Autowired
//	private CustomerRepository customerRepository;
//	
//	public Account createAccount(Account account) {
//		
//		Customer customer = map(account);
//		customer = customerRepository.save(customer);
//		
//		//Here the account would also be created. Because this is an example for 
//		//demonstration purposes no account is really created
//		
//		//Once the account would be created, password woudln't be returned, for test purposes we just delete it
//		account.setPassword(null);
//		
//		return account;
//	}
//	
//	private Customer map(Account account) {
//		
//		Customer customer = new Customer();
//		customer.setAge(account.getAge());
//		customer.setEmail(account.getEmail());
//		customer.setName(account.getName());
//		
//		return customer;
//	}
//}

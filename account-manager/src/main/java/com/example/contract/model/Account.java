///**
// * 
// */
//package com.example.contract.model;
//
//import java.io.Serializable;
//
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
///**
// * @author jarodriguez
// *
// */
//@Data
//@NoArgsConstructor
//@ApiModel(description = "Account for customers")
//public class Account implements Serializable{
//
//	private static final long serialVersionUID = -1537092188363840915L;
//	
//	@ApiModelProperty(value = "Name of the customer", required = true)
//	private String name;
//	
//	@ApiModelProperty(value = "Username of the account", required = true)
//	private String username;
//	
//	@ApiModelProperty(value = "Customer email associated to the account", required = true)
//	private String email;
//	
//	@ApiModelProperty(value = "Password for the account", required = true)
//	private String password;
//	
//	@ApiModelProperty(value = "Customer's age")
//	private int age;
//}

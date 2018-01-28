///**
// * 
// */
//package com.example.contract.model;
//
//import java.io.Serializable;
//
//import com.fasterxml.jackson.annotation.JsonInclude;
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
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@NoArgsConstructor
//@ApiModel(description = "Customer object model")
//public class Customer implements Serializable {
//
//	private static final long serialVersionUID = -4490985455004888709L;
//	
//	@ApiModelProperty(hidden = true)
//	private String _id;
//	
//	@ApiModelProperty(value = "Name of the customer", required = true)
//	private String name;
//	
//	@ApiModelProperty(value = "Email of the customer. Must respect the email pattern", required = true)
//	private String email;
//	
//	@ApiModelProperty(value = "Age of the customer")
//	private int age;
//	
//	public Customer(String name, String email, int age){
//		this.name = name;
//		this.email = email;
//		this.age = age;
//	}
//}

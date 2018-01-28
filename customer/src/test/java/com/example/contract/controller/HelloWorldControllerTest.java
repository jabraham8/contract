///**
// * 
// */
//package com.example.contract.controller;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import com.example.contract.CustomerApplicationTest;
//
///**
// * @author jarodriguez
// *
// */
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, 
//		classes = CustomerApplicationTest.class)
//@AutoConfigureMockMvc
//@ActiveProfiles("test")
//public class HelloWorldControllerTest {
//	
//	@Autowired
//	private MockMvc mockMvc;
//
//	@Test
//	public void helloWorldTest() throws Exception {
//
//		mockMvc.perform(get("/test/helloWorld"))
//			.andExpect(status().isOk())
//			.andExpect(content().string("Hello World!"));
//	}
//}

///**
// * 
// */
//package com.example.contract.configuration;
//
//import org.junit.Before;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
//import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import com.example.contract.AccountManagerApplicationTest;
//
//import io.restassured.module.mockmvc.RestAssuredMockMvc;
//
///**
// * @author jarodriguez
// *
// */
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = {AccountManagerApplicationTest.class})
//@AutoConfigureMockMvc
//@ActiveProfiles("test")
//@AutoConfigureStubRunner
//public abstract class AccountManagerBaseIntegrationTest {
//	
//	
//	@Autowired
//	private MockMvc mockMvc;
//	
//	@Before
//	public void setup() {
//		RestAssuredMockMvc.mockMvc(mockMvc);
//	}
//}

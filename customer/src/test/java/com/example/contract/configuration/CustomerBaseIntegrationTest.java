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
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import com.example.contract.CustomerApplicationTest;
//
//import io.restassured.module.mockmvc.RestAssuredMockMvc;
//
///**
// * @author jarodriguez
// * 
// */
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = {CustomerApplicationTest.class})
//@AutoConfigureMockMvc
//@ActiveProfiles("test")
//public abstract class CustomerBaseIntegrationTest {
//	
//	@Autowired
//	private MockMvc mockMvc;
//	
//	@Before
//	public void setup() {
//		RestAssuredMockMvc.mockMvc(mockMvc);
//	}
//}

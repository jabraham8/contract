/**
 * 
 */
package com.example.contract.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.contract.AccountManagerApplicationTest;

/**
 * @author jarodriguez
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, 
	classes = AccountManagerApplicationTest.class)
@AutoConfigureMockMvc
@ActiveProfiles("test")
@AutoConfigureStubRunner
public class AccountControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void shouldCreateAccount() throws Exception {
		
		String body = "{\"name\":\"Manuel\", \"username\":\"manuel32\", \"email\":\"manuel@gmail.com\", "
				+ "\"password\":\"m45u23\", \"age\":32}";
		
		mockMvc.perform(
			post("/account")
			.contentType(APPLICATION_JSON_UTF8_VALUE)
			.content(body))
		.andExpect(MockMvcResultMatchers.status().is2xxSuccessful())
		.andExpect(content().contentType(APPLICATION_JSON_UTF8_VALUE))
			.andExpect(jsonPath("name", is("Manuel")))
			.andExpect(jsonPath("age", is(32)))
			.andExpect(jsonPath("email", is("manuel@gmail.com")));
		
	}
}

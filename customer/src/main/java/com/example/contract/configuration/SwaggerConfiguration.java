/**
 * 
 */
package com.example.contract.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author jarodriguez
 *
 */
@Configuration
@EnableSwagger2
@ComponentScan
public class SwaggerConfiguration {

	private static final String GROUP_NAME = "customer-API";
	private static final String API_TITLE = "Customer API";
	private static final String API_VERSION = "1.0";
	private static final String API_DESCRIPTION = "API for low-level Microservice Customer. Allows typical CRUD operations.";
	private static final String API_PATHS_REGEX = "/test.*|/customer.*";
	
	@Bean
	public Docket getApiDefinition() {
		return new Docket(DocumentationType.SWAGGER_2).groupName(GROUP_NAME)
				.apiInfo(getApiInfo()).select().paths(getApiPaths()).build();
	}
	
	/**
	 * This is necessary in order to filter the documented paths. If not spring-boot-actuator endpoints (and others)
	 * would be shown, when what we really want to document is the functional API
	 */
	private Predicate<String> getApiPaths() {
		return Predicates.or(PathSelectors.regex(API_PATHS_REGEX));
	}

	private ApiInfo getApiInfo() {
		return new ApiInfoBuilder().title(API_TITLE).version(API_VERSION).description(API_DESCRIPTION)
				.contact(new Contact("Developer", null, "yourEmail@mailserver.com")).build();
	}
}

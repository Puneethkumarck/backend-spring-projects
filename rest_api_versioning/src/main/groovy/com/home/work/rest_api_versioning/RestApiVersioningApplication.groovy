package com.home.work.rest_api_versioning

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2
import static springfox.documentation.builders.PathSelectors.regex

@SpringBootApplication
@EnableSwagger2
class RestApiVersioningApplication {

	static void main(String[] args) {
		SpringApplication.run RestApiVersioningApplication, args
	}

	@Bean
	Docket swaggerOrderApi10() {
		 new Docket(DocumentationType.SWAGGER_2)
				.groupName("order-api-1.0")
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.home.work.rest_api_versioning.controller"))
				.paths(regex("/order/v1.0.*"))
				.build()
				.apiInfo(new ApiInfoBuilder().version("1.0").title("Order API").description("Documentation Order API v1.0").build())
	}


	@Bean
	Docket swaggerPersonApi11() {
		 new Docket(DocumentationType.SWAGGER_2)
				.groupName("order-api-1.1")
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.home.work.rest_api_versioning.controller"))
				.paths(regex("/order/v1.1.*"))
				.build()
				.apiInfo(new ApiInfoBuilder().version("1.1").title("Order API").description("Documentation Order API v1.1").build())
	}


	@Bean
	Docket swaggerPersonApi12() {
		 new Docket(DocumentationType.SWAGGER_2)
				.groupName("order-api-1.2")
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.home.work.rest_api_versioning.controller"))
				.paths(regex("/order/v1.2.*"))
				.build()
				.apiInfo(new ApiInfoBuilder().version("1.2").title("Order API").description("Documentation Order API v1.2").build())
	}
}

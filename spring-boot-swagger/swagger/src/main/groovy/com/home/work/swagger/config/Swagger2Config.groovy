package com.home.work.swagger.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2
import com.google.common.collect.Sets

@Configuration
@EnableSwagger2
class Swagger2Config {

    @Bean
    Docket createRestApi(){
        new Docket(DocumentationType.SWAGGER_2)
        .produces(Sets.newHashSet("application/json"))
        .consumes(Sets.newHashSet("application/json"))
        .protocols(Sets.newHashSet("http","https"))
        .apiInfo(getApiInfo())
        .forCodeGeneration(true)
        .select()
        //Specifies the directory path where the controller is stored
        .apis(RequestHandlerSelectors.basePackage("com.home.work.swagger.rest"))
        .paths(PathSelectors.any())
        .build()
    }

    private ApiInfo getApiInfo(){
        new ApiInfoBuilder().title("Restful spi").description('restful api interface documentation').version("v1").build()
    }

}

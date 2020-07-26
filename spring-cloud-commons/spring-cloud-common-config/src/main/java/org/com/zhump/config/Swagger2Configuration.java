package org.com.zhump.config;

import io.swagger.annotations.ApiOperation;
import org.com.zhump.core.Swagger2Porperties;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
public class Swagger2Configuration {


    @Bean
    private Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        Swagger2Porperties swagger2 = new Swagger2Porperties();
        return new ApiInfoBuilder()
                .title(swagger2.getTitle())
                .description(swagger2.getDescription())
                .license(swagger2.getLicense())
                .licenseUrl(swagger2.getLicenseUrl())
                .version(swagger2.getVersion())
                .contact(new Contact(swagger2.getContactName(),swagger2.getContactUrl(),swagger2.getContactEmail()))
                .build();
    }
}

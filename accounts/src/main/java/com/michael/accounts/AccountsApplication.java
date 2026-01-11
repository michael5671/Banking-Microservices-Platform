package com.michael.accounts;

import com.michael.accounts.dto.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value ={AccountsContactInfoDto.class})
@OpenAPIDefinition(
        info=@Info(
                title="Accounts microservice REST API Documentation",
                description = "Banking Platform Account microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name="Gia Phu",
                        email="phu@giaphu.com"
                ),
                license = @License(
                        name="Apache 20",
                        url=""
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Bank platform Account microservice REST API Documentation"
        )
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}

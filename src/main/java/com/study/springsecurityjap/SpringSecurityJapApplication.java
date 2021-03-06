package com.study.springsecurityjap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = UserRepository.class)
@SpringBootApplication
public class SpringSecurityJapApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJapApplication.class, args);
    }

}

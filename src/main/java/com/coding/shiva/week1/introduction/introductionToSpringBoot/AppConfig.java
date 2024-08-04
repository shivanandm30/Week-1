package com.coding.shiva.week1.introduction.introductionToSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean

    Apple getApple(){
        return new Apple();
    }
}

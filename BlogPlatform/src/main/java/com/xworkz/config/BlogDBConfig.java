package com.xworkz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.xworkz.component")
public class BlogDBConfig {
    public BlogDBConfig(){
        System.out.println("The BlogDBConfig created");
    }

    @Bean
    public String name(){
        System.out.println("The name is defined.");
        return "AKASHA GR";
    }

    @Bean
    public String email(){
        System.out.println("The email is defined.");
        return "akasha@gmail.com";
    }
}

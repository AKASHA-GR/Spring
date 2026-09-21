package com.xworkz.config;

import com.xworkz.initializer.ApplicationWebInit;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.xworkz.component")
public class ApplicationConfiguration {

    public ApplicationConfiguration(){
        System.out.println("ApplicationConfiguration started.");
    }
}

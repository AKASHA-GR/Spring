package com.xworkz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.component")
public class BlogDBConfig {
    public BlogDBConfig(){
        System.out.println("The BlogDBConfig created");
    }
}

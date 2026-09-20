package com.xworkz.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;



@Component
public class Toy {

    @Autowired
    @Qualifier("name")
    private String newName;
    @Autowired
    @Qualifier("email")
    private String newEmail;



    public Toy(){
        System.out.println("The Toy created");
    }

    @Bean
    public Toy getToy(){
        Toy toy = new Toy();
        System.out.println("The toy is not created by Bean");
        return toy;
    }
}


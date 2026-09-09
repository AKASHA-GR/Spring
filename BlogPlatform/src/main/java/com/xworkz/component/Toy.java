package com.xworkz.component;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Toy {
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


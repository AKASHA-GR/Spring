package com.xworkz.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Coke {

    @Autowired
    private final String name;
    @Autowired
    private final String email;

    public Coke(@Qualifier("name") String name,
               @Qualifier("email") String email) {
        System.out.println("The Coke is created.");
        this.name = name;
        this.email = email;
        System.out.println("The name is:" + name);
        System.out.println("The email is:" + email);
    }
}

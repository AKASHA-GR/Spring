package com.xworkz.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Elephant {

    private Glue glue;

    public Elephant(){
        System.out.println("The Elephant created");
    }

    @Autowired
    public void setGlue(Glue glue) {
        System.out.println("The set glue method");
        this.glue = glue;
    }
}

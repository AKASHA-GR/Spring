package com.xworkz.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Container {

    private Glass glass;

    public Container(){
        System.out.println("The Container created");
    }

    @Autowired
    public void setGlass(Glass glass){
        System.out.println("The glass is container");
        this.glass = glass;
    }
}

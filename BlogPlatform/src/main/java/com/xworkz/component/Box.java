package com.xworkz.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Box {

    private Paint paint;

    public Box(){
        System.out.println("The Box created");
    }

    @Autowired
    public void setPaint(Paint paint){
        System.out.println("The paint is running in Box");
        this.paint = paint;
    }


}

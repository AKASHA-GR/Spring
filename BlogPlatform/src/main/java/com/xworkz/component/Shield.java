package com.xworkz.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Shield {

    private Paint paint;

    public Shield(){
        System.out.println("The Shield created");
    }

    @Autowired
    public void setPaint(Paint paint){
        System.out.println("The paint is running in shield");
    }
}

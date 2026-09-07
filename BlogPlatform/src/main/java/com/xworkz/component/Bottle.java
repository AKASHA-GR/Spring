package com.xworkz.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bottle {

    private Perfume perfume;
    private Paint paint;
    private Glue glue;

    public Bottle(){
        System.out.println("The Bottle created");
    }

    @Autowired
    public void setPerfume(Perfume perfume){
        System.out.println("The setPerfume method");
        this.perfume = perfume;
    }

    @Autowired
    public void setPaint(Paint paint){
        System.out.println("The setPaint method");
        this.paint = paint;
    }

    @Autowired
    public void setGlue(Glue glue){
        System.out.println("The setGlue method");
        this.glue = glue;
    }
}

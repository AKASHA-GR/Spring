package com.xworkz.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {

    private Light light;

    public Camera(){
        System.out.println("The Camera created");
    }

    @Autowired
    public void setLight(Light light){
        System.out.println("The light is running in Camara");
        this.light = light;
    }
}

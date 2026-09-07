package com.xworkz.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Light {

    private Marker marker;

    public Light(){
        System.out.println("The Light created");
    }

    @Autowired
    public void setMarker(Marker marker){
        System.out.println("The marker is running in Light");
        this.marker = marker;
    }
}

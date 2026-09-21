package com.xworkz.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component
public class TestComponent {


    public TestComponent(){
        System.out.println("The test is created.");
    }

    @RequestMapping("/click")
    public String onClick(){
        return "final.jsp";
    }
}

package com.xworkz.openerApp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vodka")
public class VodkaComponent {
    @Autowired
    private VodkaService vodkaService;

    public VodkaComponent() {
        System.out.println("The VodkaComponent object is created\n");
    }

    @GetMapping
    public String vodkaOpener() {
        System.out.println("The vodka() method is called");
        return "Vodka";
    }

    @PostMapping
    public String vodka() {
        System.out.println("The vodka() method is called");

        return "Vodka";
    }
}

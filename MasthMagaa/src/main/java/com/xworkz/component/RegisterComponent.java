package com.xworkz.component;

import com.xworkz.dto.RegisterDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class RegisterComponent {

    public RegisterComponent(){
        System.out.println("The RegisterComponent is created.");
    }

    @RequestMapping("/register")
    public String register(Model model, RegisterDTO registerDTO){
        model.addAttribute("registerMessage","Registered Successfully");
        System.out.println("The RegisterDTO:"+registerDTO);
        return "Register.jsp";
    }
}

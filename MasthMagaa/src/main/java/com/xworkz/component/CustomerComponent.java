package com.xworkz.component;

import com.xworkz.dto.CustomerDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class CustomerComponent {

    public CustomerComponent(){
        System.out.println("The CustomerComponent is created");
    }

    @RequestMapping("/customer")
    public String customer(Model model, CustomerDTO customerDTO){
        System.out.println("The customer is:"+customerDTO);
        model.addAttribute("customerMessage","The customer is created successfully.");
        return "Customer.jsp";
    }
}

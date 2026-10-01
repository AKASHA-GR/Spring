package com.xworkz.component;

import com.xworkz.dto.CustomerDTO;
import com.xworkz.service.CamaraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Component
@RequestMapping("/")
public class CustomerComponent {

    @Autowired
    private CamaraService camaraService;

    public CustomerComponent(){
        System.out.println("The CustomerComponent is created");
    }

    @PostMapping("/customer")
    public String customer(Model model, @Valid  CustomerDTO customerDTO, BindingResult bindingResult){
        System.out.println("The customer is:"+customerDTO);

        if(bindingResult.hasErrors()){
            System.out.println("There is error in validation, please fix it.");
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationErrors",errors);
            model.addAttribute("customerDTO",customerDTO);
        }else {
            System.out.println("There is no validation error, will continue to execute the service. ");
        }

        model.addAttribute("customerMessage","The customer is created successfully.");
        return "Customer.jsp";
    }
}

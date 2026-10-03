package com.xworkz.component;

import com.xworkz.dto.RegisterDTO;
import com.xworkz.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Component
@RequestMapping("/")
public class RegisterComponent {

    @Autowired
    private RegistrationService registerService;

    public RegisterComponent(){
        System.out.println("The RegisterComponent is created.");
    }

    @RequestMapping("/register")
    public String register(Model model, @Valid RegisterDTO registerDTO, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            System.out.println("There is a validation error, please fit the errors.");
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationErrors",errors);
            model.addAttribute("registerDTO",registerDTO);
        }else {
            System.out.println("There is no validation error, we can execute the service.");
            this.registerService.saveAndValidate(registerDTO);
            model.addAttribute("registerMessage","Registered Successfully");
            System.out.println("The RegisterDTO:"+registerDTO);
        }

        return "Register.jsp";
    }
}

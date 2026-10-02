package com.xworkz.component;

import com.xworkz.dto.TravelRegistrationDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import javax.validation.Valid;
import java.util.List;

@Component
public class TravelComponent {
    public TravelComponent() {
        System.out.println("TravelComponent is created");
    }

    public String registerTravel(Model model, @Valid TravelRegistrationDTO travelRegistrationDTO, BindingResult bindingResult) {
        System.out.println("Travel registered successfully");

        if(bindingResult.hasErrors()){
            System.out.println("There are validation errors, please fix it");
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationErrors", errors);
            model.addAttribute("travelRegistrationDTO", travelRegistrationDTO);
        }else {
            System.out.println("Travel registered successfully");
            model.addAttribute("travelRegistrationDTO",travelRegistrationDTO);
        }

        return "Travel.jsp";


    }
}

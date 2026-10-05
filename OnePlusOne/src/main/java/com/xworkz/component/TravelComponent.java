package com.xworkz.component;

import com.xworkz.dto.TravelRegistrationDTO;
import com.xworkz.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import javax.validation.Valid;
import java.util.List;

@Component
@RequestMapping("/register")
public class TravelComponent {

    @Autowired
    private TravelService travelService;

    private List<String> travelTypes;
    private List<String> paymentMethods;

    public TravelComponent() {
        System.out.println("TravelComponent is created");
    }

    @PostConstruct
    public void init() {
        System.out.println("TravelComponent is initialized");
        this.travelTypes = List.of("Flight", "Train", "Bus", "Car");
        this.paymentMethods = List.of("Credit Card", "Debit Card", "Cash", "UPI");
    }

    @PostMapping
    public String registerTravel(Model model, @Valid TravelRegistrationDTO travelRegistrationDTO, BindingResult bindingResult) {
        System.out.println("Travel registered successfully");

        if(bindingResult.hasErrors()){
            System.out.println("There are validation errors, please fix it");
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationErrors", errors);
            model.addAttribute("travelRegistrationDTO", travelRegistrationDTO);
        }else {
            System.out.println("Travel registered successfully");
            travelService.saveAndValidate(travelRegistrationDTO);
            System.out.println("The travel registration details are :"+travelRegistrationDTO);
            model.addAttribute("travelMessage", "Travel registered successfully");
        }

        return "Travel.jsp";


    }

    @GetMapping
    public String register(Model model) {

        System.out.println("Travel registered successfully");

        model.addAttribute("travelTypes", travelTypes);
        model.addAttribute("paymentMethods", paymentMethods);

        return "Travel.jsp";
    }
}

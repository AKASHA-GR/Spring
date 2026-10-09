package com.xworkz.openerApp.component;

import com.xworkz.openerApp.dto.WhiskeyDTO;
import com.xworkz.openerApp.service.WhiskeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/whiskey")
public class WhiskeyComponent {

    @Autowired
    private WhiskeyService whiskeyService;

    public WhiskeyComponent() {
        System.out.println("The WhiskeyComponent object is created\n");
    }

    @GetMapping
    public String opener() {
        System.out.println("The opener() method is called");
        return "Whiskey";
    }

    @PostMapping
    public String whiskey(@Valid WhiskeyDTO whiskeyDTO, Model model, BindingResult bindingResult) {
        System.out.println("The whiskey() method is called");
        System.out.println("Received WhiskeyDTO: " + whiskeyDTO);
        if(bindingResult.hasErrors()){
            System.out.println("There is validation error,please correct them");
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationErrors",errors);
            model.addAttribute("whiskeyDTO",whiskeyDTO);
        }else {
            System.out.println("There is no validation error,please execute the service");
            this.whiskeyService.validateAndSave(whiskeyDTO);
            System.out.println("whiskeyDTO"+whiskeyDTO);
        }
        return "Whiskey";
    }
}

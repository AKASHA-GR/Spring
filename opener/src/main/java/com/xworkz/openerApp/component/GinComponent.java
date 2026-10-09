package com.xworkz.openerApp.component;

import com.xworkz.openerApp.dto.GinDTO;
import com.xworkz.openerApp.service.GinService;
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
@RequestMapping("/gin")
public class GinComponent {

    @Autowired
    private GinService ginService;

    public GinComponent() {
        System.out.println("The GinComponent object is created\n");
    }

    @GetMapping
    public String opener() {
        System.out.println("The opener() method is called");
        return "Gin.jsp";
    }

    @PostMapping
    public String gin(Model model, @Valid GinDTO ginDTO, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            System.out.println("There is a validation error, please correct it");
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationErrors",errors);
            model.addAttribute("GinDTO",ginDTO);
        }else {
            System.out.println("There is no validation error, please enter the gin service");
            ginService.validateAndSave(ginDTO);
            model.addAttribute("GinMessage","The gin is saved successfully");
        }
        System.out.println("The gin() method is called");

        return "Gin.jsp";
    }

}

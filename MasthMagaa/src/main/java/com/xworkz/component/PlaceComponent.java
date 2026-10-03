package com.xworkz.component;

import com.xworkz.dto.PlaceDTO;
import com.xworkz.service.PlaceService;
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
public class PlaceComponent {

    @Autowired
    private PlaceService placeService;

    public PlaceComponent() {
        System.out.println("The Place is created.");
    }

    @PostMapping("/place")
    public String place(Model model, @Valid PlaceDTO placeDTO, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            System.out.println("There is validation error, please fit the error.");
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationError",errors);
            model.addAttribute("placeDTO",placeDTO);
        } else{
            System.out.println("There is no validation error, please execute the service.");
            this.placeService.saveAndValidate(placeDTO);
            model.addAttribute("placeMessage","The place is created");
            System.out.println("The PlaceDTO"+placeDTO);
        }

        return "/Place.jsp";
    }
}

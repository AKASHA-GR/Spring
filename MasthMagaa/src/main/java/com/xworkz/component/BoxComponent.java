package com.xworkz.component;

import com.xworkz.dto.BiscuitsDTO;
import com.xworkz.dto.BoxDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Component
@RequestMapping("/")
public class BoxComponent {

    public BoxComponent(){
        System.out.println("The Box component is created.");
    }

    @RequestMapping("/box")
    public String box(Model model, @Valid BoxDTO boxDTO, BindingResult bindingResult){
        System.out.println("The BoxDTO:"+boxDTO);

        if(bindingResult.hasErrors()){
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationErrors",errors);
            model.addAttribute("boxDTO",boxDTO);
            System.out.println("The validation is validation error,please fix it.");
        }else{
            System.out.println("There is no validation error, will continue to execute the service.");
        }

        model.addAttribute("boxMessage","The box is created.");
        return "Box.jsp";
    }

}

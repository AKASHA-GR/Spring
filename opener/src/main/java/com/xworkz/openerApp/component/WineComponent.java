package com.xworkz.openerApp.component;

import com.xworkz.openerApp.dto.WineDTO;
import com.xworkz.openerApp.service.WineService;
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
@RequestMapping("/")
public class WineComponent {

    @Autowired
    private WineService wineService;

    public WineComponent() {
        System.out.println("The WineComponent object is created\n");
    }

    @PostMapping("/wine")
    public String onClick(Model model, @Valid WineDTO wineDTO, BindingResult bindingResult){
        System.out.println("The onClick() method is called\n");

        if(bindingResult.hasErrors()){
            System.out.println("There is validation error, please correct it\n");
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationErrors", errors);
            model.addAttribute("wineDTO", wineDTO);
        }else{
            System.out.println("There is no validation error, please continue execution of service\n");
            model.addAttribute("The wine details are "+ wineDTO);
            wineService.validateAndSave(wineDTO);
            model.addAttribute("wineMessage","The wine is added successfully.");
        }


        return "Wine.jsp";
    }

    @GetMapping("/opener")
    public String opener(){
        System.out.println("The opener() method is called\n");

        return "Wine.jsp";
    }
}

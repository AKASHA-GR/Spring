package com.xworkz.openerApp.component;

import com.xworkz.openerApp.dto.BeerDTO;
import com.xworkz.openerApp.service.BeerService;
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
@RequestMapping("/beer")
public class BeerComponent {

    @Autowired
    private BeerService beerService;

    public void process() {
        System.out.println("The BeerComponent object is created\n");
    }

    @GetMapping
    public String beerOpener() {
        System.out.println("The beerOpener() method is called");
        return "Beer.jsp";
    }

    @PostMapping
    public String beer(Model model, @Valid BeerDTO beerDTO, BindingResult bindingResult) {
        System.out.println("The beer() method is called");
        if(bindingResult.hasErrors()){
            System.out.println("There is validation error, please fit it correctly");
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationErrors",errors);
            model.addAttribute("beerDTO", beerDTO);
        }else{
            System.out.println("There is no validation error, please execute the service");
            this.beerService.validateAndSave(beerDTO);
            model.addAttribute("beerMessage", "Beer saved successfully");
        }
        return "Beer.jsp";
    }
}

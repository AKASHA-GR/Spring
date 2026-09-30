package com.xworkz.component;

import com.xworkz.dto.BiscuitsDTO;
import com.xworkz.service.BiscuitService;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Component
@RequestMapping("/")
public class BiscuitComponent {

    private BiscuitService biscuitService;

    public BiscuitComponent(){
        System.out.println("The BiscuitsComponent is created.");
    }

    @RequestMapping("/biscuits")
    public String biscuit(@Valid Model model, BiscuitsDTO biscuitsDTO, BindingResult bindingResult){
        System.out.println("The BiscuitsDTO:-"+biscuitsDTO);

        biscuitService.saveAndValidate(biscuitsDTO);

        model.addAttribute("biscuitMessage","The biscuit is created.");
        return "Biscuits.jsp";
    }


}

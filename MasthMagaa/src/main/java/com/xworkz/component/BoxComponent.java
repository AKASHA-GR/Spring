package com.xworkz.component;

import com.xworkz.dto.BiscuitsDTO;
import com.xworkz.dto.BoxDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class BoxComponent {

    public BoxComponent(){
        System.out.println("The Box component is created.");
    }

    @RequestMapping("/box")
    public String box(Model model, BoxDTO boxDTO){
        System.out.println("The BoxDTO:"+boxDTO);
        model.addAttribute("boxMessage","The box is created.");
        return "Box.jsp";
    }

}

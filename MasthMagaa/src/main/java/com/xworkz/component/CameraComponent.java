package com.xworkz.component;

import com.xworkz.dto.CamaraDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class CameraComponent {

    public CameraComponent(){
        System.out.println("The CustomerComponent is created.");
    }

    @RequestMapping("/camara")
    public String camara(Model model, CamaraDTO camaraDTO) {
        System.out.println("The CamaraDTO :--->"+camaraDTO);
        model.addAttribute("camaraMessage","The camana is created.");
        return "Camara.jsp";
    }

}

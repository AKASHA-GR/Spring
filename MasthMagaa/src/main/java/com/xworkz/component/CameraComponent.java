package com.xworkz.component;

import com.xworkz.dto.CamaraDTO;
import com.xworkz.service.CamaraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.io.PrintWriter;

@Component
@RequestMapping("/")
public class CameraComponent {

    @Autowired
    private CamaraService camaraService;

    public CameraComponent(){
        System.out.println("The CustomerComponent is created.");
    }

    @RequestMapping("/camara")
    public String camara(@Valid Model model, CamaraDTO camaraDTO, BindingResult bindingResult) {
        System.out.println("The CamaraDTO :--->"+camaraDTO);

        camaraService.saveAndValidate(camaraDTO);

        model.addAttribute("camaraMessage","The camana is created.");
        return "Camara.jsp";
    }

}

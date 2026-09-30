package com.xworkz.component;

import com.xworkz.dto.CamaraDTO;
import com.xworkz.service.CamaraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.io.PrintWriter;
import java.util.List;

@Component
@RequestMapping("/")
public class CameraComponent {

    @Autowired
    private CamaraService camaraService;

    public CameraComponent(){
        System.out.println("The CustomerComponent is created.");
    }

    @RequestMapping("/camara")
    public String camara( Model model,@Valid CamaraDTO camaraDTO, BindingResult bindingResult) {
        System.out.println("The CamaraDTO :--->"+camaraDTO);

        if(bindingResult.hasErrors()){
            System.out.println("There is validation error,please fix it");
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationErrors",errors);
            model.addAttribute("camaraDTO",camaraDTO);
        }else {
            System.out.println("There is no validation error, will continue to execute the service.");
        }

        model.addAttribute("camaraMessage","The camana is created.");
        return "Camara.jsp";
    }

}

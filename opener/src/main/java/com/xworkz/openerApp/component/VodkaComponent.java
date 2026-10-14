package com.xworkz.openerApp.component;

import com.xworkz.openerApp.dto.VodkaDTO;
import com.xworkz.openerApp.service.VodkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/vodka")
public class VodkaComponent {
    @Autowired
    private VodkaService vodkaService;

    public VodkaComponent() {
        System.out.println("The VodkaComponent object is created\n");
    }

    @GetMapping
    public String vodkaOpener() {
        System.out.println("The vodka() method is called");
        return "Vodka";
    }

    @PostMapping
    public String vodka(Model model, @Valid VodkaDTO vodkaDTO, BindingResult bindingResult) {
        System.out.println("The vodka() method is called");
        if (bindingResult.hasErrors()) {
            System.out.println("There are some validation errors,please correct them");
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationErrors", errors);
            model.addAttribute("vodkaDTO", vodkaDTO);
        }else {
            System.out.println("There is no validation errors,proceeding to service");
            this.vodkaService.validateAndSave(vodkaDTO);
            model.addAttribute("message", "Vodka saved successfully");
        }

        return "Vodka";
    }

    @GetMapping("/showAll")
    public String showAll(Model model) {
        System.out.println("The showAll() method is called");
        List<VodkaDTO> vodkaDTOList = this.vodkaService.findAll();
        model.addAttribute("vodkaDTOList", vodkaDTOList);
        return "VodkaDisplay";
    }

    @GetMapping("/editVodka")
    public String editVodka(Model model, @RequestParam int id) {
        System.out.println("Running editVodka in VodkaComponent");
        System.out.println("Vodka id to edit:"+id);
        VodkaDTO vodkaDTO = this.vodkaService.findById(id);
        model.addAttribute("vodkaDTO", vodkaDTO);
        return "VodkaUpdate";
    }

    @PostMapping("/vodkaUpdate")
    public String vodkaUpdate(Model model, @Valid VodkaDTO vodkaDTO, BindingResult bindingResult) {
        System.out.println("The vodkaUpdate() method is called in component");
        this.vodkaService.validateAndSave(vodkaDTO);
        model.addAttribute("message", "Vodka updated successfully");
        return "VodkaUpdate";
    }

    @GetMapping("/vodkaDelete")
    public String vodkaDelete(Model model, @RequestParam int id){
        System.out.println("The vodkaDelete() method is called in component");
        this.vodkaService.deleteById(id);
        model.addAttribute("message", "Vodka'"+id+"' deleted successfully");
        List<VodkaDTO> vodkaDTOList = this.vodkaService.findAll();
        model.addAttribute("vodkaDTOList", vodkaDTOList);
        return "VodkaDisplay";
    }
}

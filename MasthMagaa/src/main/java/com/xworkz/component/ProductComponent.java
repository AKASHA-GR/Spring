package com.xworkz.component;

import com.xworkz.dto.ProductDTO;
import com.xworkz.service.ProductService;
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
public class ProductComponent {

    @Autowired
    private ProductService productService;

    public ProductComponent(){
        System.out.println("The ProductComponent is created.");
    }

    @PostMapping("/product")
    public String product(Model model, @Valid ProductDTO productDTO, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            System.out.println("There is an Validation error in product, please fix it.");
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationError", errors);
            model.addAttribute("productDTO", productDTO);
        }else{
            System.out.println("There is no validation error, please execute the service.");
            this.productService.saveAndValidate(productDTO);
            model.addAttribute("productMessage","The product is created successfully.");
            System.out.println("The ProductDTO is created:" +productDTO);
        }

        return "Product.jsp";
    }
}

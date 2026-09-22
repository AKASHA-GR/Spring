package com.xworkz.component;

import com.xworkz.dto.ProductDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ProductComponent {

    public ProductComponent(){
        System.out.println("The ProductComponent is created.");
    }

    @RequestMapping("/product")
    public String product(Model model, ProductDTO productDTO){
        model.addAttribute("productMessage","The product is created successfully.");
        System.out.println("The ProductDTO is created:" +productDTO);
        return "Product.jsp";
    }
}

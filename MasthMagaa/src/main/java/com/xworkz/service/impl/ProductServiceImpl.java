package com.xworkz.service.impl;

import com.xworkz.dto.ProductDTO;
import com.xworkz.service.ProductService;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Override
    public boolean saveAndValidate(ProductDTO productDTO) {
        System.out.println("The saveAndValidate is created in service class.");

        if (productDTO != null){
            return true;
        }
        return false;
    }
}

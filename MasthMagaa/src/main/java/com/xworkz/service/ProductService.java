package com.xworkz.service;

import com.xworkz.dto.ProductDTO;

public interface ProductService {
    public boolean saveAndValidate(ProductDTO productDTO);
}

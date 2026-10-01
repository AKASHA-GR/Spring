package com.xworkz.service.impl;

import com.xworkz.dto.CustomerDTO;
import com.xworkz.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public boolean saveAndValidate(CustomerDTO customerDTO) {
        System.out.println("The customerDTO is created.");
        return true;
    }
}

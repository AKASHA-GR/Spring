package com.xworkz.service;

import com.xworkz.dto.CustomerDTO;

public interface CustomerService {
    public boolean saveAndValidate(CustomerDTO customerDTO);
}

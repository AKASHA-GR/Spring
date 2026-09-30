package com.xworkz.service.impl;

import com.xworkz.dto.CamaraDTO;
import com.xworkz.service.CamaraService;
import org.springframework.stereotype.Component;


@Component
public class CamaraServiceImpl implements CamaraService {

    @Override
    public boolean saveAndValidate(CamaraDTO camaraDTO) {
        System.out.println("The saveAndValidation is running.");
        return true;
    }
}

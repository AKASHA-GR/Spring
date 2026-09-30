package com.xworkz.service.impl;

import com.xworkz.dto.BiscuitsDTO;
import com.xworkz.service.BiscuitService;
import org.springframework.stereotype.Component;

@Component
public class BiscuitServiceImpl implements BiscuitService {

    public BiscuitServiceImpl(){
        System.out.println("The BiscuitServiceImpl created. ");
    }

    @Override
    public boolean saveAndValidate(BiscuitsDTO biscuitsDTO) {
        System.out.println("The SaveAndValidate method is running.");
        return true;
    }
}

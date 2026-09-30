package com.xworkz.service.impl;

import com.xworkz.dto.BoxDTO;
import com.xworkz.service.BoxService;
import org.springframework.stereotype.Component;

@Component
public class BoxServiceImpl implements BoxService {

    public BoxServiceImpl(){
        System.out.println("The BoxServiceImpl is created.");
    }
    @Override
    public boolean saveAndValidate(BoxDTO boxDTO) {
        System.out.println("The saveAndValidate is called.");
        return true;
    }
}

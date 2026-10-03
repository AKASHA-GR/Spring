package com.xworkz.service.impl;

import com.xworkz.dto.RegisterDTO;
import com.xworkz.service.RegistrationService;
import org.springframework.stereotype.Component;

@Component
public class RegistrationServiceImpl implements RegistrationService {
    @Override
    public boolean saveAndValidate(RegisterDTO registerDTO) {
        System.out.println("The saveAndValidate is created in service class.");

        if(registerDTO != null){
            return true;
        }
        return false;
    }
}

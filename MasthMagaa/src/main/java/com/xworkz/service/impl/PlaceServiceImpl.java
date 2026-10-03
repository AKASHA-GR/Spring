package com.xworkz.service.impl;

import com.xworkz.dto.PlaceDTO;
import com.xworkz.service.PlaceService;
import org.springframework.stereotype.Component;

@Component
public class PlaceServiceImpl implements PlaceService {

    @Override
    public boolean saveAndValidate(PlaceDTO placeDTO) {
        System.out.println("The saveAndValidate is created in service class.");

        if(placeDTO != null){
            return true;
        }

        return false;
    }
}

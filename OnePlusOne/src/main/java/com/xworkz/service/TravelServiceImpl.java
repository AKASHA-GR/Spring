package com.xworkz.service;

import com.xworkz.dto.TravelRegistrationDTO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class TravelServiceImpl implements TravelService {


    public TravelServiceImpl() {
        System.out.println("TravelServiceImpl created");
    }


    @Override
    public boolean saveAndValidate(TravelRegistrationDTO travelRegistrationDTO) {

        if(travelRegistrationDTO != null){
            return true;
        }
        return true;
    }
}

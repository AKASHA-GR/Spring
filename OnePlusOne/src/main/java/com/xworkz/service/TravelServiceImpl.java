package com.xworkz.service;

import com.xworkz.dto.TravelRegistrationDTO;

public class TravelServiceImpl implements TravelService {


    public TravelServiceImpl() {
        System.out.println("TravelServiceImpl created");
    }


    @Override
    public boolean saveAndValidate(TravelRegistrationDTO travelRegistrationDTO) {
        return true;
    }
}

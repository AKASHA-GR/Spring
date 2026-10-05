package com.xworkz.repo;

import com.xworkz.dto.TravelRegistrationDTO;

public class TravelRepoImpl implements TravelRepo{
    @Override
    public boolean save(TravelRegistrationDTO travelRegistrationDTO) {
        System.out.println("Travel saved successfully");
        return true;
    }
}

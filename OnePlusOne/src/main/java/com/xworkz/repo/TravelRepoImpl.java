package com.xworkz.repo;

import com.xworkz.dto.TravelRegistrationDTO;
import org.springframework.stereotype.Repository;

@Repository
public class TravelRepoImpl implements TravelRepo{
    @Override
    public boolean save(TravelRegistrationDTO travelRegistrationDTO) {
        System.out.println("Travel saved successfully");
        return true;
    }
}

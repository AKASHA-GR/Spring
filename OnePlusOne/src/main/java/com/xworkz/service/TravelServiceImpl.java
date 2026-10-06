package com.xworkz.service;

import com.xworkz.dto.TravelRegistrationDTO;
import com.xworkz.repo.TravelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class TravelServiceImpl implements TravelService {

    @Autowired
    private TravelRepo travelRepo;


    public TravelServiceImpl() {
        System.out.println("TravelServiceImpl created");
    }


    @Override
    public boolean saveAndValidate(TravelRegistrationDTO travelRegistrationDTO) {

        if(travelRegistrationDTO != null){
            travelRepo.save(travelRegistrationDTO);
            return true;
        }
        return true;
    }
}

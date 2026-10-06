package com.xworkz.service.impl;

import com.xworkz.dto.WineDTO;
import com.xworkz.repository.WineRepository;
import com.xworkz.service.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WineServiceImpl implements WineService {

    @Autowired
    private WineRepository wineRepository;

    @Override
    public boolean validateAndSave(WineDTO wineDTO) {
        System.out.println("The validateAndSave() method is called\n");
        if(wineDTO != null){
            wineRepository.save(wineDTO);
            return true;
        }
        return false;
    }
}

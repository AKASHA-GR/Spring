package com.xworkz.repository.Impl;

import com.xworkz.dto.WineDTO;
import com.xworkz.repository.WineRepository;
import org.springframework.stereotype.Repository;

@Repository
public class WineRepositoryImpl implements WineRepository {
    @Override
    public boolean save(WineDTO wineDTO) {
        System.out.println("The save() method is called\n");
        return true;
    }
}

package com.xworkz.openerApp.service.impl;

import com.xworkz.openerApp.dto.WineDTO;
import com.xworkz.openerApp.entity.WineEntity;
import com.xworkz.openerApp.repository.WineRepository;
import com.xworkz.openerApp.service.WineService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WineServiceImpl implements WineService {

    @Autowired
    private WineRepository wineRepository;

    @Override
    public boolean validateAndSave(WineDTO wineDTO) {
        System.out.println("The validateAndSave() method is called\n");
        if(wineDTO != null){
            WineEntity wineEntity = new WineEntity();
            wineRepository.save(wineEntity);
            BeanUtils.copyProperties(wineDTO, wineEntity);
            return true;
        }
        return false;
    }
}

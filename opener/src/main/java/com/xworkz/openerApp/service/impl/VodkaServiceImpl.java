package com.xworkz.openerApp.service.impl;

import com.xworkz.openerApp.dto.VodkaDTO;
import com.xworkz.openerApp.entity.VodkaEntity;
import com.xworkz.openerApp.service.VodkaService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VodkaServiceImpl implements VodkaService {
    @Override
    public boolean validateAndSave(VodkaDTO vodkaDTO) {
        System.out.println("The validateAndSave() method is called");
        System.out.println("Received VodkaDTO: " + vodkaDTO);
        if(vodkaDTO != null){
            System.out.println("VodkaDTO is not null, saving it");
            VodkaEntity vodkaEntity = new VodkaEntity();
            BeanUtils.copyProperties(vodkaDTO, vodkaEntity);
            return true;
        }
        return false;
    }
}

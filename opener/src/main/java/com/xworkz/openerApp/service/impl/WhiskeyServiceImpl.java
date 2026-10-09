package com.xworkz.openerApp.service.impl;

import com.xworkz.openerApp.dto.WhiskeyDTO;
import com.xworkz.openerApp.entity.WhiskeyEntity;
import com.xworkz.openerApp.repository.WhiskeyRepository;
import com.xworkz.openerApp.service.WhiskeyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WhiskeyServiceImpl implements WhiskeyService {

    @Autowired
    private WhiskeyRepository whiskeyRepository;

    public WhiskeyServiceImpl() {
        System.out.println("The WhiskeyServiceImpl object is created\n");
    }

    @Override
    public boolean validateAndSave(WhiskeyDTO whiskeyDTO) {
        System.out.println("The validateAndSave() method is called\n");
        if(whiskeyDTO != null){
            System.out.println("The whiskeyDTO is not null\n");
            System.out.println("WhiskeyDTO content: " + whiskeyDTO);
            WhiskeyEntity whiskeyEntity = new WhiskeyEntity();
            BeanUtils.copyProperties(whiskeyDTO, whiskeyEntity);
            System.out.println("WhiskeyEntity content before saving: " + whiskeyEntity);
            whiskeyRepository.save(whiskeyEntity);
            return true;
        }
        return false;
    }
}

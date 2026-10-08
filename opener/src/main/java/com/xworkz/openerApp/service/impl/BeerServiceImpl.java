package com.xworkz.openerApp.service.impl;

import com.xworkz.openerApp.dto.BeerDTO;
import com.xworkz.openerApp.entity.BeerEntity;
import com.xworkz.openerApp.repository.BeerRepository;
import com.xworkz.openerApp.service.BeerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BeerServiceImpl implements BeerService {

    @Autowired
    private BeerRepository beerRepository;

    @Override
    public boolean validateAndSave(BeerDTO beerDTO) {
        System.out.println("The BeerServiceImpl object is created\n");
        if(beerDTO !=null){
            System.out.println("The beerDTO is not null\n");
            BeerEntity beerEntity = new BeerEntity();
            BeanUtils.copyProperties(beerDTO, beerEntity);
            beerRepository.save(beerEntity);
            return true;
        }
        return false;
    }
}

package com.xworkz.openerApp.service.impl;

import com.xworkz.openerApp.dto.BeerDTO;
import com.xworkz.openerApp.entity.BeerEntity;
import com.xworkz.openerApp.repository.BeerRepository;
import com.xworkz.openerApp.service.BeerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Service
@Transactional
public class BeerServiceImpl implements BeerService {

    @Autowired
    private BeerRepository beerRepository;

    public BeerServiceImpl() {
        System.out.println("The BeerServiceImpl object is created\n");
    }

    @Override
    public boolean validateAndSave(BeerDTO beerDTO) {
        System.out.println("The validateAndSave() method is called\n");
        if(beerDTO != null){
            System.out.println("The beerDTO is not null\n");
            System.out.println("BeerDTO content: " + beerDTO);
            BeerEntity beerEntity = new BeerEntity();
            BeanUtils.copyProperties(beerDTO, beerEntity);
            System.out.println("BeerEntity content before saving: " + beerEntity);
            beerRepository.save(beerEntity);
            return true;
        }
        return false;
    }

    @Override
    public List<BeerDTO> getAll() {
        System.out.println("The getAll() method is called");
        List<BeerEntity> beerEntities = beerRepository.getAll();
        return beerEntities.stream()
                .map(entity -> {
                    BeerDTO dto = new BeerDTO();
                    BeanUtils.copyProperties(entity, dto);
                    return dto;
                })
                .collect(java.util.stream.Collectors.toList());
    }
}

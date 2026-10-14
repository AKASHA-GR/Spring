package com.xworkz.openerApp.service.impl;

import com.xworkz.openerApp.dto.VodkaDTO;
import com.xworkz.openerApp.entity.VodkaEntity;
import com.xworkz.openerApp.repository.VodkaRepository;
import com.xworkz.openerApp.service.VodkaService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class VodkaServiceImpl implements VodkaService {
    @Autowired
    private VodkaRepository vodkaRepository;

    @Override
    public boolean validateAndSave(VodkaDTO vodkaDTO) {
        System.out.println("The validateAndSave() method is called");
        System.out.println("Received VodkaDTO: " + vodkaDTO);
        if(vodkaDTO != null){
            System.out.println("VodkaDTO is not null, saving it");
            VodkaEntity vodkaEntity = new VodkaEntity();
            BeanUtils.copyProperties(vodkaDTO, vodkaEntity);
            return vodkaRepository.save(vodkaEntity);
        }
        return false;
    }

    @Override
    public List<VodkaDTO> findAll() {
        System.out.println("The findAll() method is called in service");
        List<VodkaEntity> vodkaEntityList = vodkaRepository.findAll();


        if (!vodkaEntityList.isEmpty()){
            System.out.println("VodkaEntityList is not empty, converting to DTOs");
            return vodkaEntityList.stream()
                    .map(entity -> {
                        VodkaDTO vodkaDTO = new VodkaDTO();
                        BeanUtils.copyProperties(entity,vodkaDTO);
                        return vodkaDTO;
                    }).collect(Collectors.toList());
        }
        System.out.println("There is no vodka entity exists");

        return Collections.emptyList();
    }

    @Override
    public VodkaDTO findById(int id) {
        System.out.println("The findById() method is called in service");
        if(id >= 0){
            System.out.println("The id is positive, we will search vodka by id ");
            Optional<VodkaEntity> vodkaEntityOptional=this.vodkaRepository.findById(id);
            if(vodkaEntityOptional.isPresent()){
                VodkaEntity vodkaEntity = vodkaEntityOptional.get();
                VodkaDTO vodkaDTO = new VodkaDTO();
                BeanUtils.copyProperties(vodkaEntity, vodkaDTO);
                return vodkaDTO;
            }
        }
        System.out.println("id is not positive or data is not there");

        return null;
    }

    @Override
    public Boolean deleteById(int id) {
        System.out.println("The deleteById() method is called in service");
        if(id >= 0){
            System.out.println("The id is positive, we will delete vodka by id ");
            return this.vodkaRepository.deleteById(id);
        }
        System.out.println("id is not positive or data is not there");
        return false;
    }
}

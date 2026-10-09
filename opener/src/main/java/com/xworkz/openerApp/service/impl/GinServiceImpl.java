package com.xworkz.openerApp.service.impl;

import com.xworkz.openerApp.dto.GinDTO;
import com.xworkz.openerApp.entity.GinEntity;
import com.xworkz.openerApp.repository.GinRepository;
import com.xworkz.openerApp.service.GinService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GinServiceImpl implements GinService {

    @Autowired
    private GinRepository ginRepository;

    public GinServiceImpl() {
        System.out.println("The GinServiceImpl object is created\n");
    }

    @Override
    public boolean validateAndSave(GinDTO ginDTO) {
        if(ginDTO != null){
            GinEntity ginEntity = new GinEntity();
            BeanUtils.copyProperties(ginDTO,ginEntity);
            ginRepository.save(ginEntity);
            return true;
        }
        return false;
    }
}

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
        System.out.println("The validateAndSave() method is called\n");
        if(ginDTO != null){
            System.out.println("The ginDTO is not null\n");
            System.out.println("GinDTO content: " + ginDTO);
            GinEntity ginEntity = new GinEntity();
            BeanUtils.copyProperties(ginDTO,ginEntity);
            System.out.println("GinEntity content before saving: " + ginEntity);
            ginRepository.save(ginEntity);
            return true;
        }
        return false;
    }
}

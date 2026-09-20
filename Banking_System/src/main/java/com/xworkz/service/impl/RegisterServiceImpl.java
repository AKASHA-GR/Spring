package com.xworkz.service.impl;

import com.xworkz.dao.RegisterDAO;
import com.xworkz.dao.impl.RegisterDAOImpl;
import com.xworkz.dto.RegisterDTO;
import com.xworkz.entity.RegisterEntity;
import com.xworkz.service.RegisterService;
import com.xworkz.util.ValidationUtil;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintViolation;
import java.util.Set;

public class RegisterServiceImpl implements RegisterService {
    Boolean isSaved = false;

    @Override
    public Boolean validateAndSave(RegisterDTO registerDTO) {

        System.out.println("Running validate method in service");
        if(registerDTO!= null){
            Set<ConstraintViolation<RegisterDTO>> violations = ValidationUtil.getValidator().validate(registerDTO);
            System.out.println("The ref of ConstraintViolation:"+violations);

            if(!registerDTO.getPassword().equals(registerDTO.getConfirmPassword())){
                System.out.println("Password does not match");
                return false;
            }

            RegisterEntity registerEntity = new RegisterEntity();

            registerEntity.setName(registerDTO.getName());
            registerEntity.setEmail(registerDTO.getEmail());
            registerEntity.setPassword(registerDTO.getPassword());
            registerEntity.setConfirmPassword(registerDTO.getConfirmPassword());
            registerEntity.setPhoneNumber(registerDTO.getPhoneNumber());
            registerEntity.setAccountNumber(registerDTO.getAccountNumber());

            RegisterDAO registerDao = new RegisterDAOImpl();
            Boolean result = registerDao.save(registerEntity);

            if(result == true){
                isSaved=true;
                System.out.println("Entity saved successfully");
            }else{
                isSaved=false;
                System.out.println("Entity not saved");
            }
        }


        return isSaved;
    }
}

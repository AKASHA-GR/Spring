package com.xworkz.service.impl;

import com.xworkz.dto.MovieDTO;
import com.xworkz.service.MovieService;
import org.springframework.stereotype.Component;

@Component
public class MovieServiceImpl implements MovieService {

    @Override
    public boolean saveAndValidate(MovieDTO movieDTO) {
        System.out.println("The saveAndValidate is created.");

        if(movieDTO != null){
            return true;
        }

        return false;
    }
}

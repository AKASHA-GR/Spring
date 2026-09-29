package com.xworkz.service;

import com.xworkz.dto.CamaraDTO;

public class CamaraServiceImpl implements CamaraService{

    @Override
    public boolean saveAndValidate(CamaraDTO camaraDTO) {
        System.out.println("The saveAndValidation is runing.");
        return true;
    }
}

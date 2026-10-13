package com.xworkz.openerApp.service;

import com.xworkz.openerApp.dto.VodkaDTO;

import java.util.List;

public interface VodkaService {
    public boolean validateAndSave(VodkaDTO vodkaDTO);
    public List<VodkaDTO> findAll();
    public VodkaDTO findById(int id);
}

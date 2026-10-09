package com.xworkz.openerApp.service;

import com.xworkz.openerApp.dto.BeerDTO;

import java.util.List;

public interface BeerService {
    public boolean validateAndSave(BeerDTO beerDTO);
    public List<BeerDTO> getAll();
}

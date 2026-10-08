package com.xworkz.openerApp.service;

import com.xworkz.openerApp.dto.BeerDTO;

public interface BeerService {
    public boolean validateAndSave(BeerDTO beerDTO);
}

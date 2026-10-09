package com.xworkz.openerApp.service;

import com.xworkz.openerApp.dto.WhiskeyDTO;

public interface WhiskeyService {
    boolean validateAndSave(WhiskeyDTO whiskeyDTO);
}

package com.xworkz.service;

import com.xworkz.dto.TravelRegistrationDTO;

public interface TravelService {
    public boolean saveAndValidate(TravelRegistrationDTO travelRegistrationDTO);
}

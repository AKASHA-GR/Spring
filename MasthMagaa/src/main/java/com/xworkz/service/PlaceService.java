package com.xworkz.service;

import com.xworkz.dto.PlaceDTO;

public interface PlaceService {
    public boolean saveAndValidate(PlaceDTO placeDTO);
}

package com.xworkz.service;

import com.xworkz.dto.RegisterDTO;

public interface RegisterService {
    public Boolean validateAndSave(RegisterDTO registerDTO);
}

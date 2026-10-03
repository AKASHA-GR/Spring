package com.xworkz.service;

import com.xworkz.dto.RegisterDTO;

public interface RegistrationService {
    public boolean saveAndValidate(RegisterDTO registerDTO);
}

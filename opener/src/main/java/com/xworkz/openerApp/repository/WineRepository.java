package com.xworkz.openerApp.repository;

import com.xworkz.openerApp.dto.WineDTO;
import com.xworkz.openerApp.entity.WineEntity;

public interface WineRepository {

    public boolean save(WineEntity wineEntity);
}

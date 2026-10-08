package com.xworkz.openerApp.repository;

import com.xworkz.openerApp.entity.BeerEntity;
import org.springframework.stereotype.Repository;

public interface BeerRepository {
    public boolean save(BeerEntity beerEntity);
}

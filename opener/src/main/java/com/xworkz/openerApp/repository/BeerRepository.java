package com.xworkz.openerApp.repository;

import com.xworkz.openerApp.entity.BeerEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BeerRepository {
    public boolean save(BeerEntity beerEntity);
    public List<BeerEntity> getAll();
}

package com.xworkz.openerApp.repository;

import com.xworkz.openerApp.entity.BeerEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface BeerRepository {
    public boolean save(BeerEntity beerEntity);

    public List<BeerEntity> getAll();

    public Optional<BeerEntity> findById(int id);

    public Boolean deleteById(int id);

}

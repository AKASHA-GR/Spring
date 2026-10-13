package com.xworkz.openerApp.repository;

import com.xworkz.openerApp.entity.VodkaEntity;

import java.util.List;
import java.util.Optional;

public interface VodkaRepository {

    public Boolean save(VodkaEntity vodkaEntity);
    public List<VodkaEntity> findAll();
    Optional<VodkaEntity> findById(int id);

}

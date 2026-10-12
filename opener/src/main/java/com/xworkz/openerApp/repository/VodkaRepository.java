package com.xworkz.openerApp.repository;

import com.xworkz.openerApp.entity.VodkaEntity;

import java.util.List;

public interface VodkaRepository {

    public Boolean save(VodkaEntity vodkaEntity);
    public List<VodkaEntity> getAll();

}

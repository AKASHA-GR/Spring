package com.xworkz.openerApp.repository.Impl;

import com.xworkz.openerApp.entity.WineEntity;
import com.xworkz.openerApp.repository.WineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class WineRepositoryImpl implements WineRepository {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public boolean save(WineEntity wineEntity) {
        System.out.println("The save() method is called\n");
        entityManager.persist(wineEntity);
        return true;
    }
}

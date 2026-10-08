package com.xworkz.openerApp.repository.Impl;

import com.xworkz.openerApp.entity.BeerEntity;
import com.xworkz.openerApp.repository.BeerRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class BeerRepositoryImpl implements BeerRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean save(BeerEntity beerEntity) {
        System.out.println("The BeerRepositoryImpl object is created");
        if(beerEntity != null){
            entityManager.persist(beerEntity);
            return true;
        }

        return false;
    }
}

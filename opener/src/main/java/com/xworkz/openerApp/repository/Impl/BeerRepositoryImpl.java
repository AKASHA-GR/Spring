package com.xworkz.openerApp.repository.Impl;

import com.xworkz.openerApp.entity.BeerEntity;
import com.xworkz.openerApp.repository.BeerRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.List;

@Repository
public class BeerRepositoryImpl implements BeerRepository {

    @PersistenceContext
    private EntityManager entityManager;

    List<BeerEntity> beerList;

    public BeerRepositoryImpl() {
        System.out.println("The BeerRepositoryImpl object is created\n");
    }

    @Override
    public boolean save(BeerEntity beerEntity) {
        System.out.println("The BeerRepositoryImpl object is created");
        if(beerEntity != null){
            entityManager.persist(beerEntity);
            return true;
        }

        return false;
    }

    @Override
    public List<BeerEntity> getAll() {
        System.out.println("The getAll() method is called");
        return entityManager.createNamedQuery("BeerEntity.findAll", BeerEntity.class).getResultList();
    }
}

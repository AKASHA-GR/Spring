package com.xworkz.openerApp.repository.Impl;

import com.xworkz.openerApp.entity.WhiskeyEntity;
import com.xworkz.openerApp.repository.WhiskeyRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class WhiskeyRepositoryImpl implements WhiskeyRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public WhiskeyRepositoryImpl() {
        System.out.println("The WhiskeyRepositoryImpl object is created");
    }

    @Override
    public boolean save(WhiskeyEntity whiskeyEntity) {
        System.out.println("The save() method is called");
        if(whiskeyEntity != null){
            this.entityManager.persist(whiskeyEntity);
            return true;
        }
        return false;
    }
}

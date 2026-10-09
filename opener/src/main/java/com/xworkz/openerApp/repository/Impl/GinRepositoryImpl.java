package com.xworkz.openerApp.repository.Impl;

import com.xworkz.openerApp.entity.GinEntity;
import com.xworkz.openerApp.repository.GinRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class GinRepositoryImpl implements GinRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public GinRepositoryImpl() {
        System.out.println("The GinRepositoryImpl object is created");
    }

    @Override
    public boolean save(GinEntity ginEntity) {
        System.out.println("The save() method is called");
        if (ginEntity != null){
            this.entityManager.persist(ginEntity);
            return true;
        }
        return false;
    }
}

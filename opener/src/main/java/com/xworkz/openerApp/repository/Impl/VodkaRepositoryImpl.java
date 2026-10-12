package com.xworkz.openerApp.repository.Impl;

import com.xworkz.openerApp.entity.VodkaEntity;
import com.xworkz.openerApp.repository.VodkaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class VodkaRepositoryImpl implements VodkaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public VodkaRepositoryImpl() {
        System.out.println("The VodkaRepositoryImpl object is created\n");
    }

    @Override
    public Boolean save(VodkaEntity vodkaEntity) {
        System.out.println("The save() method is called");
        System.out.println("VodkaEntity: " + vodkaEntity);
        if(vodkaEntity != null){
            entityManager.persist(vodkaEntity);
            return true;
        }
        return false;
    }

    @Override
    public List<VodkaEntity> getAll() {
        System.out.println("The getAll() method is called");
        return entityManager.createNamedQuery("VodkaEntity.findAll", VodkaEntity.class).getResultList();
    }
}

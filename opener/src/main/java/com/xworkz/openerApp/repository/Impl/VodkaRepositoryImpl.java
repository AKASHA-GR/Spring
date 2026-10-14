package com.xworkz.openerApp.repository.Impl;

import com.xworkz.openerApp.entity.VodkaEntity;
import com.xworkz.openerApp.repository.VodkaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

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
            entityManager.merge(vodkaEntity);
            return true;
        }
        return false;
    }

    @Override
    public List<VodkaEntity> findAll() {
        System.out.println("The findAll() method is called in repository");
        List<VodkaEntity> vodkaEntityList = this.entityManager
                .createNamedQuery("VodkaEntity.findAll", VodkaEntity.class)
                .getResultList();

        System.out.println("Total vodka entities: " + vodkaEntityList.size());

        return vodkaEntityList;
    }

    @Override
    public Optional<VodkaEntity> findById(int id) {
        System.out.println("The findById() method is called in repository");
        VodkaEntity vodkaEntity = this.entityManager.find(VodkaEntity.class, id);
        return Optional.ofNullable(vodkaEntity);
    }

    @Override
    public Boolean deleteById(int id) {
        System.out.println("The deleteById() method is called in repository");
        if(id > 0){
            VodkaEntity vodkaEntity = this.entityManager.find(VodkaEntity.class, id);
            if(vodkaEntity != null){
                this.entityManager.remove(vodkaEntity);
                return true;
            }
            System.out.println("Entity with id " + id + " not found");
        }
        return false;
    }


}

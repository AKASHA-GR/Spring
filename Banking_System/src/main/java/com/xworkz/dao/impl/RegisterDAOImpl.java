package com.xworkz.dao.impl;

import com.xworkz.dao.RegisterDAO;
import com.xworkz.entity.RegisterEntity;
import com.xworkz.util.EntityManagerFactoryUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

public class RegisterDAOImpl implements RegisterDAO {
    @Override
    public Boolean save(RegisterEntity registerEntity) {

        System.out.println("Running save method in dao");
        Boolean isSaved = null;
        EntityManager em = null;
        EntityTransaction et = null;

        if(registerEntity != null){
            try{
                em = EntityManagerFactoryUtil.getEntityManagerFactory().createEntityManager();
                et = em.getTransaction();
                et.begin();
                em.persist(registerEntity);
                et.commit();
                isSaved = true;

            }catch (PersistenceException e){
                e.printStackTrace();
                if(et != null){
                    et.rollback();
                }
            }finally {
                if(em != null){
                    em.close();
                }
            }
        }else {
            System.out.println("The registerEntity is cannot be null");
        }

        return isSaved;
    }
}

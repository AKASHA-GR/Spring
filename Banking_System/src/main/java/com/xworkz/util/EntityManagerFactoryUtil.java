package com.xworkz.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryUtil {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("bank");

    public static  EntityManagerFactory getEntityManagerFactory(){
        return emf;
    }
}

package com.razaractor.repository;

import java.io.Serializable;
import javax.ejb.Stateless;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.Disposes;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.razaractor.qualifiers.CustomerRepositoryUnit;

@Stateless
public class EntityManagerFactory implements Serializable {

    private static final long serialVersionUID = -6552676606818724092L;
    @PersistenceContext(unitName = "customerApp")
    private EntityManager customerEntityManager;

    public @Produces
    @CustomerRepositoryUnit
    EntityManager retrieveEntityManager() {
        return customerEntityManager;
    }

    public void disposeEntityManager(@Disposes @CustomerRepositoryUnit EntityManager em) {
    }
}

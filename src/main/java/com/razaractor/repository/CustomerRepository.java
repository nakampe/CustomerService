package com.razaractor.repository;

import com.razaractor.entity.Customer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

/**
 *
 * @author nakampe
 */
public class CustomerRepository {

    @PersistenceContext(type = PersistenceContextType.TRANSACTION)
    private EntityManager entityManager;

    public List<Customer> getCustomers() {
        return entityManager.createQuery("select c from Customer c order by c.name").getResultList();
    }

    public Customer getCustomer(Long id) {
        return entityManager.find(Customer.class, id);
    }

    public void addCustomer(Customer customer) {
        entityManager.persist(customer);
    }

    public void removeCustomer(Long id) {
        Customer customerToRemove = entityManager.find(Customer.class, id);
        entityManager.remove(customerToRemove);
    }

    public Customer updateCustomer(Customer customer) {
        return entityManager.merge(customer);
    }
}

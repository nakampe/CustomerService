package com.razaractor;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import static javax.ejb.TransactionAttributeType.REQUIRES_NEW;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import junit.framework.TestCase;
import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.Before;
import java.util.concurrent.Callable;
import org.junit.Test;

/**
 *
 * @author nakampe
 */
public class CustomerServiceTest extends TestCase{

    private EntityManagerFactory emf ;
    private EntityManager em;
    private EntityTransaction trans;

    public CustomerServiceTest() {
    }

    @Before
    public void setUp() {
        emf = Persistence.createEntityManagerFactory("customerApp");
//        em = emf.createEntityManager();
            trans = emf.createEntityManager().getTransaction();
    }

    @After
    public void tearDown() {
        emf.close();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
         System.out.println("Hi there ==");
     }
     
      /**
     * This little bit of magic allows our test code to execute in
     * the scope of a container controlled transaction.
     */
    @Stateless
    @TransactionAttribute(REQUIRES_NEW)
    public static class TransactionBean  {

        public <V> V call(Callable<V> callable) throws Exception {
            return callable.call();
        }
    }
}

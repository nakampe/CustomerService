package com.razaractor;

import com.razaractor.entity.Customer;
import com.razaractor.impl.CustomerServiceImpl;
import com.razaractor.repository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.times;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author nakampe
 */
@RunWith(MockitoJUnitRunner.class)
public class TestCustomerService {
    
    @Mock
    private CustomerRepository customerRepo;
    @InjectMocks
    private CustomerServiceImpl customerServiceImpl;
    
    public TestCustomerService() {
    }
    
    @Test
    public void addCustomerWithEmptyTest(){
        Customer customer = new Customer();
        Mockito.doNothing().when(customerRepo).addCustomer(customer);
        customerServiceImpl.addCustomer(customer);
        
        Mockito.verify(customerRepo,times(1)).addCustomer(customer);
    }

}

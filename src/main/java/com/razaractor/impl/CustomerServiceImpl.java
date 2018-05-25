package com.razaractor.impl;

import com.razaractor.CustomerService;
import com.razaractor.entity.Customer;
import com.razaractor.repository.CustomerRepository;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author nakampe
 */
@Local(CustomerService.class)
@Stateless
public class CustomerServiceImpl implements CustomerService {
    
    @Inject
    private CustomerRepository customerRepository;
    
    @Override
    public Customer getCustomer(Long id) {
        return customerRepository.getCustomer(id);
    }
    
    @Override
    public List<Customer> getCustomers() {
        return customerRepository.getCustomers();
    }
    
    @Override
    public Customer updateCustomer(Customer customer) {
      return customerRepository.updateCustomer(customer);
    }
    
    @Override
    public void addCustomer(Customer customer) {
        customerRepository.addCustomer(customer);
    }
    
    @Override
    public void removeCustomer(Long id) {
        customerRepository.removeCustomer(id);
    }
    
}

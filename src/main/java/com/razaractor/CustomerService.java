package com.razaractor;

import com.razaractor.entity.Customer;
import java.util.List;

/**
 *
 * @author nakampe
 */
public interface CustomerService {

    Customer getCustomer(Long id);

    List<Customer> getCustomers();

    Customer updateCustomer(Customer customer);

    void addCustomer(Customer customer);

    void removeCustomer(Long id);
}

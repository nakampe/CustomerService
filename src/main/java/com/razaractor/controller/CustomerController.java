package com.razaractor.controller;

import com.razaractor.CustomerService;
import com.razaractor.entity.Customer;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author nakampe
 */
@Named
@SessionScoped
public class CustomerController implements Serializable {

    private static final long serialVersionUID = -7836912904699269232L;

    @Inject
    private CustomerService customerService;
    
    @Getter @Setter
    private Customer customer;
    
    @Getter @Setter
    private Boolean edit = Boolean.FALSE;

    @PostConstruct
    private void init() {
        customer = new Customer();
    }

    public void addCustomer() {
        customerService.addCustomer(customer);
        customer = new Customer();
    }

    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }
    
    public void deleteCustomer(Customer customer){
        customerService.removeCustomer(customer.getId());
    }
    
    public void editCustomer(Customer customer){
        this.customer = customer; 
        edit = Boolean.TRUE;
    }
    
    public void saveCustomer(){
        customerService.updateCustomer(customer);
        edit = Boolean.FALSE;
    }
    
    public void cancel(){
        edit = Boolean.FALSE;
    }

}

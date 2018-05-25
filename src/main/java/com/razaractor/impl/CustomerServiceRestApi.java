package com.razaractor.impl;

import com.razaractor.CustomerService;
import com.razaractor.entity.Customer;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author nakampe
 */
@Path("")
@Stateless
@Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class CustomerServiceRestApi {

    @Inject
    private CustomerService customerService;

    @GET
    @Path("/customer/id/{id}")
    public Customer getCustomer(@PathParam("id") Long id) {
        System.out.println("Customer Id= "+id);
        Customer customer = customerService.getCustomer(id);
        System.out.println("Customer Id = "+customer);
        return customer;
    }

    @GET
    @Path("/customers")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @PUT
    @Path("/customer")
    public Customer updateCustomer(Customer customer) {
        return customerService.updateCustomer(customer);
    }

    @POST
    @Path("/customer")
    public void addCustomer(Customer customer) {
        customerService.addCustomer(customer);
    }

    @DELETE
    @Path("/customer/id/{id}")
    public void removeCustomer(@PathParam("id")Long id) {
        customerService.removeCustomer(id);
    }
}

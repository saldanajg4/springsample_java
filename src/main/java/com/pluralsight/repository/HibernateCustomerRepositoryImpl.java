package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//stubbing hibernate but not
//add it to the interface by hand
// but extract an interface out.  Refactor Interface (name customerRepository and define
// findAll()
@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
    @Override
    public List<Customer> findAll(){
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstName("Jose Gabriel");
        customer.setLastName(("Saldana Baez"));
        customers.add(customer);

        return customers;
    }
}

package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//all the business logic will be created here
//we're hard coding some stuff here but then later spring will help us
//add implementation code
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(){}

    public CustomerServiceImpl(CustomerRepository repo){
        System.out.println("We are using constructor injection");
        this.customerRepository = repo;
    }

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("We are using setter injection");
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll(){
        return  customerRepository.findAll();
    }
}

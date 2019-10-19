package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

//all the business logic will be created here
//we're hard coding some stuff here but then later spring will help us
//add implementation code
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll(){
        return  customerRepository.findAll();
    }
}
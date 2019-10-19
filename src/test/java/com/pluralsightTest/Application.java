package com.pluralsightTest;

import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class Application {
    @Test
    public void testFindAllCustomer(){
        //arrange
        CustomerService customerService = new CustomerServiceImpl(new HibernateCustomerRepositoryImpl());

        //act
        int listSize = customerService.findAll().size();
        System.out.println((customerService.findAll().get(0).getFirstName()));

        //assert
        Assert.assertTrue(listSize > 0);
    }
}

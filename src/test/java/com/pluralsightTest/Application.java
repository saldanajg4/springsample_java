package com.pluralsightTest;

import com.pluralsight.AppConfig;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    @Test
    public void testFindAllCustomer(){
        //arrange
        ApplicationContext appContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerService customerService =
                appContext.getBean("customerService",CustomerService.class);
        //act
        int listSize = customerService.findAll().size();
        System.out.println((customerService.findAll().get(0).getFirstName()));

        //assert
        Assert.assertTrue(listSize > 0);
    }
}

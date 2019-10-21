package com.pluralsight;

import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*****
 * this is to replace any xml context config file
 */
@Configuration
@ComponentScan({"com.pluralsight"})//auto wiring inside of java code under package pluralsight
public class AppConfig {
//    @Bean(name = "customerService")
//    public CustomerService getCustomerService(){
////        CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
//        CustomerServiceImpl service = new CustomerServiceImpl();
////        service.setCustomerRepository(getCustomerRepository());
//        return  service;
//    }

//    @Bean(name = "customerRepository")
//    public CustomerRepository getCustomerRepository(){
//        return new HibernateCustomerRepositoryImpl();
//    }
}

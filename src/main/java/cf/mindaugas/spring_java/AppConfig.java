package cf.mindaugas.spring_java;

import cf.mindaugas.spring_java.repository.CustomerRepository;
import cf.mindaugas.spring_java.repository.HibernateCustomerRepositoryImpl;
import cf.mindaugas.spring_java.service.CustomerService;
import cf.mindaugas.spring_java.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"cf.mindaugas.spring_java"})
@PropertySource("app.properties")
public class AppConfig {

    // setter injection
    // @Bean(name = "customerService")
    // public CustomerService getCustomerService(){
    //     CustomerServiceImpl customerService = new CustomerServiceImpl();
    //     customerService.setCustomerRepository(getCustomerRepository());
    //     return customerService;
    // }

    // constructor injection
    // @Bean(name = "customerService")
    // public CustomerService getCustomerService(){
    //     CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
    //     return customerService;
    // }

    // autowiring
    // @Bean(name = "customerService")
    // public CustomerService getCustomerService(){
    //     CustomerServiceImpl customerService = new CustomerServiceImpl();
    //     return customerService;
    // }
    //
    // @Bean(name = "customerRepository")
    // public CustomerRepository getCustomerRepository(){
    //     return new HibernateCustomerRepositoryImpl();
    // }

    // Properties file
    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}

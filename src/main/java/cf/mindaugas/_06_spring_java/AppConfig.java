package cf.mindaugas._06_spring_java;

import cf.mindaugas._06_spring_java.repository.CustomerRepository;
import cf.mindaugas._06_spring_java.repository.HibernateCustomerRepositoryImpl;
import cf.mindaugas._06_spring_java.service.CustomerService;
import cf.mindaugas._06_spring_java.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//// setter injection
//@Configuration
//public class AppConfig {
//    @Bean(name = "customerRepository")
//    public CustomerRepository getCustomerRepository() {
//        return new HibernateCustomerRepositoryImpl();
//    }
//
//    @Bean(name = "customerService")
//    public CustomerService getCustomerService() {
//        CustomerServiceImpl customerService = new CustomerServiceImpl();
//        customerService.setCustomerRepository(getCustomerRepository());
//        return customerService;
//    }
//}

//// constructor injection
//@Configuration
//public class AppConfig {
//
//    @Bean(name = "customerRepository")
//    public CustomerRepository getCustomerRepository() {
//        return new HibernateCustomerRepositoryImpl();
//    }
//
//    @Bean(name = "customerService")
//    public CustomerService getCustomerService() {
//        CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
//        return customerService;
//    }
//}

//// autowirring
//@Configuration
//@ComponentScan({"cf.mindaugas._06_spring_java"})
//public class AppConfig {
//
//    @Bean(name = "customerRepository")
//    public CustomerRepository getCustomerRepository() {
//        return new HibernateCustomerRepositoryImpl();
//    }
//
//    @Bean(name = "customerService")
//    public CustomerService getCustomerService() {
//        CustomerServiceImpl customerService = new CustomerServiceImpl();
//        return customerService;
//    }
//}

// autowirring
@Configuration
@ComponentScan({"cf.mindaugas._06_spring_java"})
public class AppConfig { }


//@Configuration
//@ComponentScan({"cf.mindaugas._06_spring_java"})
//@PropertySource("app.properties")
//public class AppConfig {
//    // @Bean // not strictly needed - resolve ${…} placeholders
//    // within bean definition property values and @Value annotations
//    // public static
//    // PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
//    //     return new PropertySourcesPlaceholderConfigurer();
//    // }
//}

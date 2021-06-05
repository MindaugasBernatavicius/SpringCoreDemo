package cf.mindaugas._02_nospring;


import cf.mindaugas._02_nospring.repository.DatabaseCustomerRepositoryImpl;
import cf.mindaugas._02_nospring.repository.InMemoryCustomerRepository;
import cf.mindaugas._02_nospring.service.CustomerService;
import cf.mindaugas._02_nospring.service.CustomerServiceImpl;

public class Application {
    public static void main(String[] args) {
        // CustomerService service = new CustomerServiceImpl();

        // DI requires us to provide the dependencies, but what if we only have 1 class in our project that
        // ... could be used as a dependency?
        //CustomerService service = new CustomerServiceImpl(new InMemoryCustomerRepository());
        CustomerService service = new CustomerServiceImpl(new DatabaseCustomerRepositoryImpl());
        System.out.println(service.findAll().get(0).getFirstname());
    }
}
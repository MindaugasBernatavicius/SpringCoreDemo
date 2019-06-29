package cf.mindaugas.spring_java.repository;

import cf.mindaugas.spring_annotations.model.Customer;
import cf.mindaugas.spring_annotations.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstname("Petras");
        customer.setLastname("Petraitis");

        customers.add(customer);

        return customers;
    }
}
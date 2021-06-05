package cf.mindaugas._05_spring_annotations.repository;

import cf.mindaugas._05_spring_annotations.model.Customer;

import java.util.ArrayList;
import java.util.List;

// @Repository("customerRepository")
public class InMemoryRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstname("Petras from memo");
        customer.setLastname("Petraitis");

        customers.add(customer);

        return customers;
    }
}

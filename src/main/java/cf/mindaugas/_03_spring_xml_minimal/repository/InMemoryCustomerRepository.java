package cf.mindaugas._03_spring_xml_minimal.repository;

import cf.mindaugas._03_spring_xml_minimal.model.Customer;

import java.util.LinkedList;
import java.util.List;

public class InMemoryCustomerRepository implements CustomerRepository {
    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new LinkedList<>();
        Customer customer = new Customer();
        customer.setFirstname("Jonas from memory");
        customer.setLastname("Jonaitis");
        customers.add(customer);
        return customers;
    }
}
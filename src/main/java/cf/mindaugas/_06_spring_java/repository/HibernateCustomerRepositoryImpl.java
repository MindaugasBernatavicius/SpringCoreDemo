package cf.mindaugas._06_spring_java.repository;

import cf.mindaugas._06_spring_java.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUsername}")
    private String dbUsername;

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstname("Jonas from db");
        customer.setLastname((dbUsername == null || dbUsername.equals("")) ? "Jonaitis" : dbUsername);
		customers.add(customer);
		return customers;
	}
}

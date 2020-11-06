package cf.mindaugas._02_nospring.repository;

import java.util.ArrayList;
import java.util.List;

import cf.mindaugas._02_nospring.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Jonas");
		customer.setLastname("Jonaitis");
		
		customers.add(customer);
		
		return customers;
	}
}

package cf.mindaugas.nospring.repository;

import java.util.ArrayList;
import java.util.List;

import cf.mindaugas.nospring.model.Customer;

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

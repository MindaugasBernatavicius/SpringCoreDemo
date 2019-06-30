package cf.mindaugas.spring_xml2.repository;

import cf.mindaugas.spring_xml2.model.Customer;

import java.util.ArrayList;
import java.util.List;

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

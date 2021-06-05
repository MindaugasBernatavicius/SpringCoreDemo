package cf.mindaugas._02_nospring.service;

import java.util.List;

import cf.mindaugas._02_nospring.model.Customer;
import cf.mindaugas._02_nospring.repository.CustomerRepository;
import cf.mindaugas._02_nospring.repository.DatabaseCustomerRepositoryImpl;
import cf.mindaugas._02_nospring.repository.InMemoryCustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	// 0. No dependency Injection
	// private CustomerRepository customerRepository = new DatabaseCustomerRepository();
	//private CustomerRepository customerRepository = new DatabaseCustomerRepositoryImpl();

	private CustomerRepository customerRepository;

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
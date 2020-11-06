package cf.mindaugas._02_nospring.service;

import java.util.List;

import cf.mindaugas._02_nospring.model.Customer;
import cf.mindaugas._02_nospring.repository.CustomerRepository;
import cf.mindaugas._02_nospring.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
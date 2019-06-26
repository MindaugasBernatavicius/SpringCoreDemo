package cf.mindaugas.service;

import java.util.List;

import cf.mindaugas.model.Customer;
import cf.mindaugas.repository.CustomerRepository;
import cf.mindaugas.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}

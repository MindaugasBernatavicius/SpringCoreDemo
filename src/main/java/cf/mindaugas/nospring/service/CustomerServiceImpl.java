package cf.mindaugas.nospring.service;

import java.util.List;

import cf.mindaugas.nospring.model.Customer;
import cf.mindaugas.nospring.repository.CustomerRepository;
import cf.mindaugas.nospring.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
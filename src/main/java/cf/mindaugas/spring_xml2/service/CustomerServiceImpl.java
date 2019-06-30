package cf.mindaugas.spring_xml2.service;

import cf.mindaugas.spring_xml2.model.Customer;
import cf.mindaugas.spring_xml2.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

	// private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
    private CustomerRepository customerRepository;

	// used for setter injection
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
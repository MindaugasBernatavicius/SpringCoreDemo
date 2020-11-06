package cf.mindaugas._03_spring_xml_minimal.service;

import cf.mindaugas._03_spring_xml_minimal.model.Customer;
import cf.mindaugas._03_spring_xml_minimal.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

	// private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
    private CustomerRepository customerRepository;

	// used for setter injection
	// public void setCustomerRepository(CustomerRepository customerRepository) {
	// 	this.customerRepository = customerRepository;
	// }

	// public CustomerServiceImpl() {
	// }

	// used for constructor injection
	public CustomerServiceImpl(CustomerRepository customerRepository, String variable) {
        System.out.println("Hello " + variable);
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
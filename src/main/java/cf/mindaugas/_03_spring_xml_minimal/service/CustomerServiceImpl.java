package cf.mindaugas._03_spring_xml_minimal.service;

import cf.mindaugas._03_spring_xml_minimal.model.Customer;
import cf.mindaugas._03_spring_xml_minimal.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

	// 0. No dependency Injection
	// private CustomerRepository customerRepository = new DatabaseCustomerRepository();
	//private CustomerRepository customerRepository = new DatabaseCustomerRepositoryImpl();

	private CustomerRepository customerRepository;

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public CustomerServiceImpl(CustomerRepository customerRepository, String name) {
		this.customerRepository = customerRepository;
		System.out.println(name);
	}

	// No default constructor found;
	// ... nested exception is java.lang.NoSuchMethodException:
	// ... cf.mindaugas._03_spring_xml_minimal.service.CustomerServiceImpl.<init>()
	public CustomerServiceImpl() {
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
	     this.customerRepository = customerRepository;
	 }

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
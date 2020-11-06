package cf.mindaugas._04_spring_xml.service;

import cf.mindaugas._04_spring_xml.model.Customer;
import cf.mindaugas._04_spring_xml.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    // setter injection
	// private CustomerRepository customerRepository;
    // public void setCustomerRepository(CustomerRepository customerRepository) {
    //     this.customerRepository = customerRepository;
    // }

    //  autowire by name
    // private CustomerRepository customerRepository;
    // public void sethCustRep(CustomerRepository customerRepository) {
    //     this.customerRepository = customerRepository;
    // }

    // constructor injection and autowire by constructor
    private CustomerRepository customerRepository;
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // // byType
    // private CustomerRepository customerRepository;
    // public void setCustomerRepository(CustomerRepository customerRepository) {
    //     this.customerRepository = customerRepository;
    // }

    @Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}

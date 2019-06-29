package cf.mindaugas.spring_xml.service;

import cf.mindaugas.spring_xml.model.Customer;
import cf.mindaugas.spring_xml.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	// used for setter injection
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    // public void sethCustRep(CustomerRepository customerRepository) {
    //     this.customerRepository = customerRepository;
    // }

    // used for constructor injection
    public CustomerServiceImpl() { }

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}

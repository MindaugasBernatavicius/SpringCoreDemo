package cf.mindaugas.spring_java.service;

import cf.mindaugas.spring_java.model.Customer;
import cf.mindaugas.spring_java.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
@Scope("prototype")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
	private CustomerRepository customerRepository;

    // @Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("Using setter injection!");
		this.customerRepository = customerRepository;
	}

    public CustomerServiceImpl() { }


    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("Using constructor injection!");
        this.customerRepository = customerRepository;
    }

    @Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}

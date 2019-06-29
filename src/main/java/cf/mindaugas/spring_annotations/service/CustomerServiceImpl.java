package cf.mindaugas.spring_annotations.service;

import cf.mindaugas.spring_annotations.model.Customer;
import cf.mindaugas.spring_annotations.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("Using constructor autowiring injection!");
        this.customerRepository = customerRepository;
    }

    // @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("Using setter autowiring injection!");
        this.customerRepository = customerRepository;
    }

    // @Autowired
    private CustomerRepository customerRepository;

    @Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}

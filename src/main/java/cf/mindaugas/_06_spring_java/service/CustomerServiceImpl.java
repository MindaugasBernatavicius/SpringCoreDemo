package cf.mindaugas._06_spring_java.service;

import cf.mindaugas._06_spring_java.model.Customer;
import cf.mindaugas._06_spring_java.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// setter injection
// @Service("customerService")
// public class CustomerServiceImpl implements CustomerService {
//
//     private CustomerRepository customerRepository;
//
//     public void setCustomerRepository(CustomerRepository customerRepository) {
//         System.out.println("Using setter injection!");
//         this.customerRepository = customerRepository;
//     }
//
//     @Override
//     public List<Customer> findAll() {
//         return customerRepository.findAll();
//     }
// }

// // constructor injection
// @Service("customerService")
// public class CustomerServiceImpl implements CustomerService {
//
//     private CustomerRepository customerRepository;
//
//     public CustomerServiceImpl(CustomerRepository customerRepository) {
//         System.out.println("Using constructor injection!");
//         this.customerRepository = customerRepository;
//     }
//
//     @Override
//     public List<Customer> findAll() {
//         return customerRepository.findAll();
//     }
// }

// autowirring
// @Service("customerService")
// public class CustomerServiceImpl implements CustomerService {
//
//     @Autowired // we use member autowiring
//     private CustomerRepository customerRepository;
//
//     // @Autowired // if we were to uncomment this, we would start using the setter autowiring
//     public void setCustomerRepository(CustomerRepository customerRepository) {
//         System.out.println("Using setter injection!");
//         this.customerRepository = customerRepository;
//     }
//
//     public CustomerServiceImpl(){}
//
//     // ... we would use constructor autowiring
//     public CustomerServiceImpl(CustomerRepository customerRepository) {
//         System.out.println("Using constructor injection!");
//         this.customerRepository = customerRepository;
//     }
//
//     @Override
//     public List<Customer> findAll() {
//         return customerRepository.findAll();
//     }
// }

// // autowirring
// @Service("customerService")
// public class CustomerServiceImpl implements CustomerService {
//
//     @Autowired // we use member autowiring
//     private CustomerRepository customerRepository;
//
//     @Override
//     public List<Customer> findAll() {
//         return customerRepository.findAll();
//     }
// }

// // bean scopes
// @Service("customerService")
// // @Scope("singleton")
// @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
// public class CustomerServiceImpl implements CustomerService {
//
//     @Autowired // we use member autowiring
//     private CustomerRepository customerRepository;
//
//     @Override
//     public List<Customer> findAll() {
//         return customerRepository.findAll();
//     }
// }

// property files
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
	private CustomerRepository customerRepository;

    @Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}

package cf.mindaugas._02_nospring.service;

import java.util.List;

import cf.mindaugas._02_nospring.model.Customer;

public interface CustomerService {
	List<Customer> findAll();
}
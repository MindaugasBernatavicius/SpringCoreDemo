package cf.mindaugas.service;

import java.util.List;

import cf.mindaugas.model.Customer;

public interface CustomerService {
	List<Customer> findAll();
}
package cf.mindaugas.nospring.service;

import java.util.List;

import cf.mindaugas.nospring.model.Customer;

public interface CustomerService {
	List<Customer> findAll();
}
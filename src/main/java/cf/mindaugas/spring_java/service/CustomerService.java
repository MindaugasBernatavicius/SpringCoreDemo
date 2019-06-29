package cf.mindaugas.spring_java.service;

import cf.mindaugas.spring_java.model.Customer;

import java.util.List;

public interface CustomerService {
	List<Customer> findAll();
}
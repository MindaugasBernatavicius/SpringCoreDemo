package cf.mindaugas.spring_annotations.service;

import cf.mindaugas.spring_annotations.model.Customer;

import java.util.List;

public interface CustomerService {
	List<Customer> findAll();
}
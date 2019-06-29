package cf.mindaugas.spring_annotations.repository;

import cf.mindaugas.spring_annotations.model.Customer;

import java.util.List;

public interface CustomerRepository {
	List<Customer> findAll();
}
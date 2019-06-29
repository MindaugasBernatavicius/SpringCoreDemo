package cf.mindaugas.spring_java.repository;

import cf.mindaugas.spring_java.model.Customer;

import java.util.List;

public interface CustomerRepository {
	List<Customer> findAll();
}
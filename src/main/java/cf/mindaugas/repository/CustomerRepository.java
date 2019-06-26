package cf.mindaugas.repository;

import java.util.List;

import cf.mindaugas.model.Customer;

public interface CustomerRepository {
	List<Customer> findAll();
}
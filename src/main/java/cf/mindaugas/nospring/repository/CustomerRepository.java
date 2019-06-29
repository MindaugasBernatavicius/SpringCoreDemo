package cf.mindaugas.nospring.repository;

import java.util.List;

import cf.mindaugas.nospring.model.Customer;

public interface CustomerRepository {
	List<Customer> findAll();
}
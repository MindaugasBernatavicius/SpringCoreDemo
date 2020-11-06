package cf.mindaugas._02_nospring.repository;

import java.util.List;

import cf.mindaugas._02_nospring.model.Customer;

public interface CustomerRepository {
	List<Customer> findAll();
}
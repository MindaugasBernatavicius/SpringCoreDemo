package cf.mindaugas.spring_xml.repository;

import cf.mindaugas.spring_xml.model.Customer;

import java.util.List;

public interface CustomerRepository {
	List<Customer> findAll();
}
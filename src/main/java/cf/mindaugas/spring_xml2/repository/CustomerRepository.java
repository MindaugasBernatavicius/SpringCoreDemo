package cf.mindaugas.spring_xml2.repository;

import cf.mindaugas.spring_xml2.model.Customer;

import java.util.List;

public interface CustomerRepository {
	List<Customer> findAll();
}
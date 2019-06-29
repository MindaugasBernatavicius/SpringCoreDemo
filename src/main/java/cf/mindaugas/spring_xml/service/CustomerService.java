package cf.mindaugas.spring_xml.service;

import cf.mindaugas.spring_xml.model.Customer;

import java.util.List;

public interface CustomerService {
	List<Customer> findAll();
}
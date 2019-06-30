package cf.mindaugas.spring_xml2.service;

import cf.mindaugas.spring_xml2.model.Customer;

import java.util.List;

public interface CustomerService {
	List<Customer> findAll();
}
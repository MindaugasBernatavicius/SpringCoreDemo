package cf.mindaugas._04_spring_xml.repository;

import cf.mindaugas._04_spring_xml.model.Customer;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUsername}")
	private String dbUsername;

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    @Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Jonas");
		customer.setLastname(
				(dbUsername == null || dbUsername.equals(""))
                        ? "Jonaitis" : dbUsername);
		customers.add(customer);
		return customers;
	}
}

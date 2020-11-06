package cf.mindaugas._01_dependencyinjection;

public class CustomerServiceImpl {

	// no D.I. - hardcoded dependency
	private Repository customerRepository = new CustomerRepositoryImpl();

	// with D.I. - we inject the object to the class instead of it creating the object
    private Repository cr;

    // setter injection
    public void setRepository(Repository cr){
        this.cr = cr;
    }

    // constructor injection
    public CustomerServiceImpl(Repository cr){
        this.cr = cr;
    }
}
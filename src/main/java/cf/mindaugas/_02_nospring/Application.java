package cf.mindaugas._02_nospring;


import cf.mindaugas._02_nospring.service.CustomerService;
import cf.mindaugas._02_nospring.service.CustomerServiceImpl;

public class Application {
    public static void main(String[] args) {
        CustomerService service = new CustomerServiceImpl();
        System.out.println(service.findAll().get(0).getFirstname());
    }
}
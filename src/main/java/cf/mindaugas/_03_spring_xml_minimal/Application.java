package cf.mindaugas._03_spring_xml_minimal;

import cf.mindaugas._03_spring_xml_minimal.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        // Note, previously we configured CustomerService like so:
        // ... CustomerService service = new CustomerServiceImpl(new DatabaseCustomerRepositoryImpl());
        // ... now the configuration is outsourced to *.xml file

        ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext-xml-minimal.xml");
        CustomerService service = appCtx.getBean("customerService", CustomerService.class);
        System.out.println(service.findAll().get(0).getFirstname());
    }
}
package cf.mindaugas.spring_xml_minimal;

import cf.mindaugas.spring_xml_minimal.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext-xml-minimal.xml");
        CustomerService service = appCtx.getBean("customerService", CustomerService.class);

        // CustomerService service = new CustomerServiceImpl();
        System.out.println(service.findAll().get(0).getFirstname());
    }
}
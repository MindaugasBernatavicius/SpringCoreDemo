package cf.mindaugas.spring_xml;


import cf.mindaugas.spring_xml.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        // CustomerService service = new CustomerServiceImpl();

        ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext-xml.xml");

        // Note - we are still coding to the interface, so that we can swap out the implementations (IoC)!
        CustomerService service = appCtx.getBean("customerService", CustomerService.class);
        CustomerService service2 = appCtx.getBean("customerService", CustomerService.class);
        System.out.println(service);
        System.out.println(service2);


        System.out.println(service.findAll().get(0).getFirstname());

        // Properties file demo
        System.out.println(service.findAll().get(0).getLastname());

    }
}
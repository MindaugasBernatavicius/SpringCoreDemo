package cf.mindaugas.spring_xml2;


import cf.mindaugas.spring_xml2.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext-xml2.xml");
        CustomerService service = appCtx.getBean("customerService", CustomerService.class);

        // CustomerService service = new CustomerServiceImpl();
        System.out.println(service.findAll().get(0).getFirstname());
    }
}
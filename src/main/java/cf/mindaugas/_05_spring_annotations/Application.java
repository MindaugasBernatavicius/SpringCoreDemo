package cf.mindaugas._05_spring_annotations;


import cf.mindaugas._05_spring_annotations.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext-annotations.xml");

        // Note - we are still coding to the interface, so that we can swap out the implementations (IoC)!
        CustomerService service = appCtx.getBean("customerService", CustomerService.class);

        System.out.println(service.findAll().get(0).getFirstname());
    }
}
package cf.mindaugas.spring_java;


import cf.mindaugas.spring_java.service.CustomerService;
import cf.mindaugas.spring_java.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// public class Application {
//
//     public static void main(String[] args) {
//         ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
//         CustomerService service1 = appContext.getBean("customerService", CustomerService.class);
//         System.out.println(service1.findAll().get(0).getFirstname());
//     }
// }

// // bean scopes
// public class Application {
//
//     public static void main(String[] args) {
//         ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
//
//         // Beans automatically singletons, not GoF singletons, but reused by the IoC container
//         CustomerService service1 = appContext.getBean("customerService", CustomerService.class);
//         CustomerService service2 = appContext.getBean("customerService", CustomerService.class);
//         System.out.println(service1);
//         System.out.println(service2);
//     }
// }


// property files
public class Application {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService service1 = appContext.getBean("customerService", CustomerService.class);
        System.out.println(service1.findAll().get(0).getFirstname());
        System.out.println(service1.findAll().get(0).getLastname());
    }
}
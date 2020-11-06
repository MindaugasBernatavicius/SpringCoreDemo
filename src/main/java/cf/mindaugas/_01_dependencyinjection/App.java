package cf.mindaugas._01_dependencyinjection;

public class App {
    public static void main(String[] args) {
        CustomerServiceImpl cs = new CustomerServiceImpl(new CustomerRepositoryImpl());
        System.out.println(cs);
    }
}

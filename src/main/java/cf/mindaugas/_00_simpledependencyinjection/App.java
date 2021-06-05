package cf.mindaugas._00_simpledependencyinjection;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1);

        Person person2 = new Person(new FullName("Jonas", "MJ", "Petraitis"));
        System.out.println(person2);

        Person person3 = new Person();
        person3.setFullName(new FullName("Mindaugas", "MB", "Brazauskas"));
        System.out.println(person3);
    }
}

class Person {
    private int id;
    private FullName fullName;

    // 0. No Dependency Injection -> class person creates it's own dependencies
    //private FullName fullName = new FullName("Jonas", "DJ", "Jonaitis");

    // 1. Constructor Dependency Injection
    public Person(FullName fullName){
        this.fullName = fullName;
    }

    public Person() { }

    // 2. Setter Dependency Injection
    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name=" + fullName +
                '}';
    }
}



class FullName {
    private String firstName;
    private String middleName;
    private String lastName;

    public FullName(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "FullName{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
package Day2.PracticeProblemsLevel_1;
class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        System.out.println("Original Person:");
        person1.displayDetails();
        Person person2 = new Person(person1);
        System.out.println("\nCloned Person:");
        person2.displayDetails();
    }
}

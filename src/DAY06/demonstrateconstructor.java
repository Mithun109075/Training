package Assignment;

class Person {

    String name;
    int age;

    // Constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class demonstrateconstructor {
    public static void main(String[] args) {

        Person p1 = new Person("Mithun", 21); // Constructor called
        p1.display();
    }
}

package DAY4;
class Parent {
    void display(){
        System.out.println("Parent class");
    }
}
class Child extends Parent {
    void display1(){
        System.out.println("Child Class");
    }
}
public class SingleLevel {
    public static void main(String[] args) {
        Child c=new Child();
        c.display1();
        c.display();

        Parent p=new Parent();//parent class has access of its own class
        p.display();
    }
}

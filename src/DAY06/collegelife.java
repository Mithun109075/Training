package DAY4;
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void walk() {
        System.out.println(name + "is Walking");
    }
}
class Student extends Person{
    Student(String name){
        super(name);
    }
    void study(){
        System.out.println(name+"is studying");
    }
}
class Professor extends Person{
    Professor(String name){
        super(name);
    }
    void teach(){
        System.out.println(name+"is teacher");
    }
}
public class collegelife {
    public static void main(String[] args){
        Student s=new Student("Nikhil");
        s.walk();
        s.study();

        Professor p=new Professor("GC");
        p.walk();
        p.teach();
    }
}

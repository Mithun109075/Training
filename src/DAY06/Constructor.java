package DAY4;

public class Constructor {
    String Name;

    Constructor() {
        this("MS Dhoni");//invoking parameterized to default//name we should not type
        System.out.println("Default constructor gets called");
    }

    Constructor(String Name) {
        //this();//invoke Default to parametrized
        this.Name = Name;
    }

    void display() {
        System.out.println(Name);
    }

    static void main(String[] args) {
        Constructor c1 = new Constructor();
        c1.display();
    }
}

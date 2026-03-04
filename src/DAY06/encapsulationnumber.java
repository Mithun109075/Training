package Assignment;

class Student {

    // Private variables (data hiding)
    private String name;
    private int marks;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class encapsulationnumber {
    public static void main(String[] args) {

        Student s1 = new Student();

        // Setting values using setters
        s1.setName("Mithun");
        s1.setMarks(90);

        // Getting values using getters
        System.out.println("Name: " + s1.getName());
        System.out.println("Marks: " + s1.getMarks());
    }
}

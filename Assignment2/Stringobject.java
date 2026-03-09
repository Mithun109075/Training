package Assignment2;
public class Stringobject {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println("Original String: " + s1);

        s1.concat(" World");   // trying to change string

        System.out.println("After concat: " + s1);
    }
}

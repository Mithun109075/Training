package Assignment2;
public class ArithimeticException {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b;   // causes ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }

        System.out.println("Program continues...");
    }
}

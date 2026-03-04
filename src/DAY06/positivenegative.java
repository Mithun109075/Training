package Assignment;

public class positivenegative {
    // Method to check number
    public static void checkNumber(int num) {
        if (num > 0) {
            System.out.println(num + " is Positive");
        } else if (num < 0) {
            System.out.println(num + " is Negative");
        } else {
            System.out.println("The number is Zero");
        }
    }

    public static void main(String[] args) {

        checkNumber(10);
        checkNumber(-5);
        checkNumber(0);
    }
}

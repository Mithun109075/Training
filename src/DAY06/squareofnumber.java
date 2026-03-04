package Assignment;
public class squareofnumber {

    // Method to calculate square
    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        int num = 5;
        int result = square(num);

        System.out.println("Square of " + num + " = " + result);
    }
}

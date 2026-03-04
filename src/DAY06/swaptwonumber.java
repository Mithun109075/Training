package Assignment;
import java.util.Scanner;
public class swaptwonumber {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int temp;   // third variable
        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping:");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

        sc.close();
    }
}

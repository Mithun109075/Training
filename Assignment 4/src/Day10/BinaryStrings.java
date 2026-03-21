package Day10;
import java.util.Scanner;

public class BinaryStrings {

    // Recursive function
    public static void generate(String str, int n) {
        if (str.length() == n) {   // Base case
            System.out.println(str);
            return;
        }

        // Add '0'
        generate(str + "0", n);

        // Add '1'
        generate(str + "1", n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        generate("", n);

        sc.close();
    }
}
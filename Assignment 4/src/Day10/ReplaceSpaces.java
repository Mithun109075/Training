package Day10;
import java.util.Scanner;

public class ReplaceSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Replace spaces with %20
        String result = str.replace(" ", "%20");

        System.out.println("Output: " + result);

        sc.close();
    }
}
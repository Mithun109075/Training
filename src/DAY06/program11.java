import java.util.Scanner;
public class program11  {


    static void main() {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("even");
        }
        else {
            System.out.print("Odd");
        }
    }
}




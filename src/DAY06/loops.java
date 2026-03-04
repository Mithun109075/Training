import java.util.Scanner;
public class loops {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n)
        {
            System.out.print(i+" ");
            i+=2;
        }
    }
}
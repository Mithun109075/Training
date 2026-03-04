public class program6 {
    static void main() {
        int a=10;
        System.out.println(a);
        double d=a;//Implicit(Widening)
        System.out.println(d);
        int b=(int)d;//Explicit(Narrowing)
        System.out.println(b);
    }
}

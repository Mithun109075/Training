package DAY4;
//static variable,method,block
public class KGF2 {
    static String HeroName="Rockstar Yash";
    static{
        System.out.println("Kalasa nikaov. .");
    }
    static void dialogue(){
        System.out.println("Violence Violence Violence");
    }
    public static void main(String[] args) {
        System.out.println("Into Main method");
        System.out.println("Hero Name"+KGF2.HeroName);
        dialogue();
    }
}

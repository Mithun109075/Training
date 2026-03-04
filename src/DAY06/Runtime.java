package day4;
class Bank {
    double getInterestRate() {
        return 5.0;
    }
}
class SavingBank extends Bank{
    @Override
    double getInterestRate() {
        return 7.5;
    }
}
public class Runtime {
    public static void main(String[] args) {
        Bank b=new SavingBank();
        System.out.println("Interest rate="+b.getInterestRate());
    }
}
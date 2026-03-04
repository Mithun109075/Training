package day5;
abstract class Appliance{
    //abstract method
    abstract void turnOn();
    //Non abstract(with body)
    void plugIn(){
        System.out.println("Appliance is plugged in");
    }
}
class Fan extends Appliance{
    @Override
    void turnOn(){
        System.out.println("Fan is spinning");
    }
}
public class AbstractionDemo1{
    public static void main(String[] args) {
        Appliance a=new Fan();
        a.plugIn();
        a.turnOn();
    }
}
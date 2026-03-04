package day5;
interface Animal{
    void sound();
    default void bite(){
        System.out.println("animal bites");
    }
}
class cat implements Animal{
    @Override
    public void sound() {
        System.out.println("meow");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        cat c = new cat();
        c.sound();
        c.bite();
    }
}
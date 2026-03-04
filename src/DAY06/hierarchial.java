package DAY4;
class Human{
    void eat(){
        System.out.println("Humans eats Pani puri");
    }
}
class Shaktiman extends Human{
    void saveWorld(){
        System.out.println("Saving the world");
    }
}
class Gangadhar extends Human{
    void earn (){
        System.out.println("gangadhar works as a reporter");
    }
}
public class hierarchial {
    static void main(String[] args) {
        Shaktiman s = new Shaktiman();
        s.eat();
        s.saveWorld();


        Gangadhar g = new Gangadhar();
        g.eat();
        g.earn();
    }
}
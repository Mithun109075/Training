package DAY5;
interface Superman{
    void fly();
}
interface WonderWomen{
    void fightCrime();
}
class DC implements Superman,WonderWomen{
    @Override
    public void fly() {
        System.out.println("Superman flies");
    }

    @Override
    public void fightCrime() {
        System.out.println("WomenWomen fights crime");
    }
}
public class MultipleInheritence {
    static void main(String[] args) {
        DC hero=new DC();
        hero.fightCrime();
        hero.fly();

    }
}

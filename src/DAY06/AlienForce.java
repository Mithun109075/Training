package DAY4;

class Ben10{
    void name(){
        System.out.println("Ben Tenyson");
    }
}
class Omnitrix extends Ben10{
    void Omnitrix(){
        System.out.println("Azmath created Omnitrix");
    }
}
class HeatBlast extends Omnitrix{
    void Alien(){
        System.out.println("Fires heat Strokes");
    }
}
public class AlienForce {
    public static void main(String[] args) {
        HeatBlast h=new HeatBlast();
        h.name();
        h.Omnitrix();
        h.Alien();
    }
}

package DAY4;
class Apple
{
    String brand="Apple";
    Apple(){
        System.out.println("Apple CDnstructor");
    }
    void showBrand(){
        System.out.println("Brand: "+brand);
    }
}
class iphone extends Apple{
    String brand="iphone 17";
    iphone(){
        super();
        System.out.println("iphone constructor");
    }
    void display(){
        System.out.println("Model:"+brand);
        System.out.println("Company:"+super.brand);
        super.showBrand();
    }
}
public class Super {
    static void main(String[] args) {
        iphone obj=new iphone();
        obj.display();
    }
}

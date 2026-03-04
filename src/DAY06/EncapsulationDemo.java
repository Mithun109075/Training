package day5;
class student{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age>0){
            this.age=age;
        }else{
            System.out.println("Invalid age");
        }
    }
    public int getAge(){
        return age;
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        student s=new student();
        s.setName("KL Rahul");
        s.setAge(31);
        System.out.println("Name:"+s.getName());
        System.out.println("Age:"+s.getAge());
        s.setAge(-10);

    }

}

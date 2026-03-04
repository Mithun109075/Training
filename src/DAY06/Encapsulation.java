package DAY4;
class Employee
{
    private String name;
    private double salary;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(double salary){
        if(salary>0){
            this.salary=salary;
        }
        else{
            System.out.println("Invalid Salary ");
        }
    }
    public double getSalary()
    {
        return salary;
    }
}

public class Encapsulation {
    static void main(String[] args) {
        Employee emp=new Employee();
        emp.setName("Peter");
        emp.setSalary(50000.00);
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());

        emp.setSalary(100000);
        System.out.println("Updated Salary"+emp.getSalary());

        emp.setSalary(-100000);
    }
}

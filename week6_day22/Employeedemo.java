import java.util.Scanner;
class Employee{
  String name;
  int id;
  float salary;
  public void talk(){
    System.out.println("nameis:"+name);
    System.out.println("ïd is:"+id);
    System.out.println("salary is:"+salary);
  }
}
public class Employeedemo{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Employee e1=new Employee();
    sc.nextLine();
    e1.name=sc.nextLine();
    e1.id=sc.nextInt();
    e1.salary=sc.nextFloat();
    e1.talk();
    System.out.println("enter the details of first employ");
    Employee e2=new Employee();
    sc.nextLine();
    e2.name=sc.nextLine();
    e2.id=sc.nextInt();
    e2.salary=sc.nextFloat();
    e2.talk();
    System.out.println("enter the details of second employ");
    Employee e3=new Employee();
    sc.nextLine();
    e3.name=sc.nextLine();
    e3.id=sc.nextInt();
    e3.salary=sc.nextFloat();
    e3.talk();
    System.out.println("enter the details of third employ");
    
    
  }
}
class Ceo{
  String role="employee";
  String companyname="bitlabs";
  void does(){
    System.out.println("working");
  }
}
class Manageremployee extends Ceo{
  String maindepartment="Manager";
}
class Accountantemployee extends Ceo{
  String maindepartment="Accountant";
}
public class Inheritance{
  public static void main(String[]args){
    Accountantemployee obj1=new Accountantemployee();
    System.out.println("Accountant employee details");
    System.out.println(obj1.companyname);
    System.out.println(obj1.role);
    System.out.println(obj1.maindepartment);
    obj1.does();
    Manageremployee obj2=new Manageremployee();
    System.out.println("Manager employee details");
    System.out.println(obj2.companyname);
    System.out.println(obj2.role);
    System.out.println(obj2.maindepartment);
    obj2.does();
  }
}
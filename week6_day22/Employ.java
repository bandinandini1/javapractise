class Employ{
  String name;
  int id;
  float salary;
  String add;
}
public void setename(String name){
  this.name=name;
}
public void seteid(int id){
  this.id=id;
}
public void setesalary(float salary){
  this.salary=salary;
}
public void seteadd(String add){
  this.add=add;
}
public String getename(){
  return name;
}
public int geteid(){
  return id;
}
public float getesalary(){
  return salary;
}
public String geteadd(){
  return add;
}
public class Ex1{
  public static void main(String[]args){
    Employ e1=new Employ();
    e1.setename("nandini");
    e1.seteid(1);
    e1.setesalary(50000);
    e1.seteadd("vijayawada");
    System.out.println("name is:"+e1.getename());
    System.out.println("id is:"+e1.geteid());
    System.out.println("salary is:"+e1.getesalary());
    System.out.println("add is:"+e1.geteadd());
  }
}
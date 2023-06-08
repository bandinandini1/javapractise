class Student{
  String name;
  int rollnum;
  static String clg="Diet";
  Student(String name,int rollnum){
    this.name=name;
    this.rollnum=rollnum;
  }
  static void change(){
    clg="dhanekula";
  }
  void print(){
    System.out.println(name+" "+rollnum+" "+clg);
  }
}
public class Studentdata{
  public static void main(String[]args){
    Student s1=new Student("nandini",410);
    Student s2=new Student("likitha",447);
    Student s3=new Student("divya",464);
    s1.print();
    s2.print();
    s3.print();
    Student.change();
    s1.print();
    s2.print();
    s3.print();
    
  }
}
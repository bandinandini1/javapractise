import java.util.Scanner;

class Employarray {
  String name;
  int id;
  float salary;

}

public class Ex3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Employarray e1[] = new Employarray[3];
    e1[0] = new Employarray();
    e1[1] = new Employarray();
    e1[2] = new Employarray();
    for (int i = 0; 1 < 3; i++) {
      System.out.println("enter employ name");
      e1[i].name = sc.nextLine();
      System.out.println("enter employ id");
      e1[i].id = sc.nextInt();
      System.out.println("enter employ salary");
      e1[i].salary = sc.nextFloat();
      sc.nextLine();

    }
    for (int i = 0; 1 < 3; i++) {
      System.out.println("employ name:"+e1[i].name);
      System.out.println("employ id:"+e1[i].id);
      System.out.println("employ salary:"+e1[i].salary);
      System.out.println();

    }
  }
}
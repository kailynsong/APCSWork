import java.util.*;

public class AcademicClass{

  public AcademicClass(Teacher a){
    this.a = a;
  }

  public void addStudent(Student s){
    class1.add(s);
  }

  public void info(){
    System.out.println("teacher's name: " + a.getName() +
      " students' names: ");
    for(Student students : class1)
      System.out.println(students.getName());
  }

  public ArrayList<Student> favoriteNum(int n){
    ArrayList<Student> empty = new ArrayList<Student>();

    for(Student students : class1){
      if(students.getNum() == n){
        empty.add(students);
      }
    }
    return empty;
  }

  public ArrayList<Student> oddNum(){
    ArrayList<Student> empty = new ArrayList<Student>();
    for(Student students : class1){
      if(students.getNum()%2==1){
        empty.add(students);
      }
    }
    return empty;
  }

  public static void main(String[] args){
    Teacher a = new Teacher("Dr. Kessner", 10);
    AcademicClass c = new AcademicClass(a);
    c.addStudent(new Student("Student A", 3));
    c.addStudent(new Student("Student B", 2));
    c.addStudent(new Student("Student C", 7));
    c.addStudent(new Student("Student D", 21));
    c.addStudent(new Student("Student E", 3));

    c.info();
    System.out.println();
    System.out.println("Students who have same favorite number: ");
    ArrayList<Student> p = c.favoriteNum(3);
    for(Student students : p){
      System.out.println(students.getName());
    }
    System.out.println();
    System.out.println("Students who have odd favorite numbers: ");
    ArrayList<Student> l = c.oddNum();
    for(Student students : l){
      System.out.println(students.getName());
    }
  }

  private Teacher a;
  private ArrayList<Student> class1 = new ArrayList<Student>();

}

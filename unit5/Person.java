
public class Person{

  private String name;
  private int pets;

  public Person(String nameIn, int petsIn){
    name = nameIn;
    pets = petsIn;
  }

  public String greeting(){
    return ("Hello, my name is " + name +
    ", and I have " + pets + " pets.");
  }

}

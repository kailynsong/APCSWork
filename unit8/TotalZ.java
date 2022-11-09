import java.util.*;

public class TotalZ{

  public static void testCountZNames(ArrayList<String> names, int expected){
    System.out.println("ArrayList: " + names + " expected: " + expected);
    if(countZNames(names) == expected){
      System.out.println("Woohoo!");
    }else{
      System.out.println("Boohoo!");
    }
  }

  public static int countZNames(ArrayList<String> names){
    int total = 0;

    for(String name: names){
      if(name.substring(0,1).equals("Z") || name.substring(0,1).equals("z")){
        total+=name.length();
      }
    }
    return total;
  }

  public static void main(String[] args){
    ArrayList<String> names = new ArrayList<String>();
    names.add("Zorro");
    names.add("zero");
    names.add("zippy");

    ArrayList<String> names1 = new ArrayList<String>();
    names1.add("Zuri");
    names1.add("zoop");
    names1.add("hi");

    System.out.println("Total Length Z Names: " + countZNames(names));

    testCountZNames(names, 14.0);
    testCountZNames(names1, 8.0);
  }

}

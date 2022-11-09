import java.util.*;

public class TotalZ{

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

    System.out.println("Total Length Z Names: " + countZNames(names));

  }

}

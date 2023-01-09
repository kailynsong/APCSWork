
import java.util.*;


public class ItemCalculator
{

  public static void itemCalculatorTest(ArrayList<Item> items){
    if(average(items) == 6.3333335){
      System.out.println("Average function works, Woohoo!");
    }else{
      System.out.println("Average function does not work, Boohoo!");
    }

    if(mostExpensive(items).equals("shampoo")){
      System.out.println("Most expensive functio works, Woohoo!");
    }else{
      System.out.println("Most expensive function doesn't work, Boohoo!");
    }

  }

  public static void itemList(ArrayList<Item> items){
      for(Item a : items){
        System.out.println("name: " + a.getName() + " price: " + a.getPrice());
      }
    }

  public static float average(ArrayList<Item> items){
      float total = 0;

      for(Item a : items){
        total += a.getPrice();
      }
      return total / items.size();
  }

  public static String mostExpensive(ArrayList<Item> items){

    float e = 0.0f;
    String itemname = "";

    for(Item a : items){
      if(a.getPrice() > e)
        {
          e = a.getPrice();
          itemname = a.getName();
        }
    }
      return itemname;
  }

  public static void main(String args[]){
    ArrayList<Item> items = new ArrayList<Item>();

    items.add(new Item("shampoo", 10.75f));
    items.add(new Item("cereal", 5.89f));
    items.add(new Item("fruits", 2.36f));

    System.out.println("the avg of all items is: " + average(items));
    System.out.println("the most expensive item is: " + mostExpensive(items));

    itemCalculatorTest(items);

    }

}

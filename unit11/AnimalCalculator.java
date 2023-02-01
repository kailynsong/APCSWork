import java.util.*;
public class AnimalCalculator{

  public static void animalTests(ArrayList<Animal> animals){
    if(average(animals) == 27.0){
      System.out.println("avg function: woohoo!");
    }else{
      System.out.println("avg function: boohoo!");
    }

    if(leastLegs(animals).equals("centipede")){
      System.out.println("leastlegs function: woohoo!");
  }else{
    System.out.println("leastlegs function: boohoo!");
}

  }


  public static void characteristics(ArrayList<Animal> animals){
    for(Animal a : animals){
      System.out.println("name: " + a.name() + " leg count: " + a.legCount()
              + " furriness: " + a.isFurry());
    }
  }

  public static double average(ArrayList<Animal> animals){
    int empty = 0;
    for(Animal a : animals){
      empty+=a.legCount();
    }
    return empty / animals.size();
  }

  public static String leastLegs(ArrayList<Animal> animals){
    String name = "";
    int number = 0;
    for(Animal a : animals){
      if(a.legCount() > number){
        number = a.legCount();
        name = a.name();
      }
    }
    return name;
  }

  public static void main(String[] args){

    ArrayList<Animal> animals = new ArrayList<Animal>();
    Starfish s = new Starfish("starfish", 5, false);
    animals.add(s);
    Centipede c = new Centipede("centipede", 100, false);
    animals.add(c);
    Kiwi k = new Kiwi("kiwi", 2, true);
    animals.add(k);
    Llama l = new Llama("llama", 4, true);
    animals.add(l);

    characteristics(animals);
    System.out.println();
    animalTests(animals);
    System.out.println();
    System.out.println("average # of legs: " + average(animals));
    System.out.println();
    System.out.println("animal with least legs: " + leastLegs(animals));
  }

}

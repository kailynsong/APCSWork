
import java.util.*;

public class PersonStats{

  public static void personStatsTest(ArrayList<Persons> p){
    if(average(p) == 2.0){
      System.out.println("avg function: Woohoo!");
    }else{
      System.out.println("avg function: Boohoo!");
    }

    if(mostPetName(p).equals("Kailyn")){
      System.out.println("most pets function: Woohoo!");
    }else{
      System.out.println("most pets function: Boohoo!");
    }
  }

  public static double average(ArrayList<Persons> p){
    int total = 0;
    for(Persons pe : p){
      total += pe.getNumber();
    }
    return total / p.size();
  }

  public static String mostPetName(ArrayList<Persons> p){
    int number = p.get(0).getNumber();
    String empty = "";

    for(Persons pe : p){
      if(pe.getNumber() > number){
        number = pe.getNumber();
        empty = pe.getName();
      }
    }
    return empty;
  }


  public static ArrayList<Persons> atLeast(ArrayList<Persons> p){
    ArrayList<Persons> people = new ArrayList<Persons>();
    for(Persons pe : p){
    if(pe.getNumber() >= 2){
      people.add(pe);
    }
  }
    return people;
  }

  public static void main(String[] args){
    ArrayList<Persons> p = new ArrayList<Persons>();
    p.add(new Persons("Dr.Kessner", 2));
    p.add(new Persons("Kailyn", 3));
    p.add(new Persons("Riley", 1));
    System.out.println("average number of pets: " + average(p));
    System.out.println("name of most pets: " + mostPetName(p));
    System.out.println("people with at least two pets: ");

    System.out.println();

    ArrayList<Persons> people = atLeast(p);
    for(Persons pe : people){
        System.out.println(pe.getName());
      }

    personStatsTest(p);

  }

}

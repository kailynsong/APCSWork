import java.util.*;
public class VehicleStats{

  public static int totalWheels(ArrayList<Vehicle> vehicles){
    int total = 0;
    for(Vehicle v : vehicles){
      total += v.wheelCount();
    }
    return total;
  }

  public static ArrayList<Vehicle> humanPower(ArrayList<Vehicle> vehicles){
    ArrayList<Vehicle> result = new ArrayList<Vehicle>();
    for(Vehicle v : vehicles){
      if(v.isHumanPowered() == true){
        result.add(v);
      }
    }
    return result;
  }

  public static void main(String[] args){

    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    Car c1 = new Car();
    vehicles.add(c1);
    Bicycle b1 = new Bicycle();
    vehicles.add(b1);
    Unicycle u1 = new Unicycle();
    vehicles.add(u1);
    Motorcycle m1 = new Motorcycle();
    vehicles.add(m1);

    System.out.println("Total wheels: " + totalWheels(vehicles) + " " +
                "vehicles human powered: " + humanPower(vehicles));
  }

}

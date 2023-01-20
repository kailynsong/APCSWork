import java.util.*;
public class VehicleTest{

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

    for(Vehicle v : vehicles){
      System.out.println(v.name() + " " + v.wheelCount() + " "
      + v.isHumanPowered());
    }

  }

}

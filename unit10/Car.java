
public class Car implements Vehicle{

  public Car(String name, int wheelcount,
                        boolean isHumanPowered){
    this.name = name;
    this.wheelcount = wheelcount;
    this.isHumanPowered = isHumanPowered;
  }

  public String name(){return "Car";}

  public int wheelCount(){return 4}

  public boolean isHumanPowered{return false}

  private String name;
  private int wheelCount;
  private boolean isHumanPowered;

}

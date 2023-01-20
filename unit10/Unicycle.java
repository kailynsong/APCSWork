
public class Unicycle implements Vehicle{

  public Car(String name, int wheelcount,
                        boolean isHumanPowered){
    this.name = name;
    this.wheelcount = wheelcount;
    this.isHumanPowered = isHumanPowered;
  }

  public String name(){return "Unicycle";}

  public int wheelCount(){return 1}

  public boolean isHumanPowered{return true}

  private String name;
  private int wheelCount;
  private boolean isHumanPowered;

}

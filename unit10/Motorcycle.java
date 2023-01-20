
public class Motorcycle implements Vehicle{

  public Motorcycle(String name, int wheelcount,
                        boolean isHumanPowered){
    this.name = name;
    this.wheelcount = wheelcount;
    this.isHumanPowered = isHumanPowered;
  }

  public String name(){return "Motorcycle";}

  public int wheelCount(){return 2}

  public boolean isHumanPowered{return false}

  private String name;
  private int wheelCount;
  private boolean isHumanPowered;

}

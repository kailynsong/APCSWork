
public class Bicycle implements Vehicle{

  public Bicycle(String name, int wheelcount,
                        boolean isHumanPowered){
    this.name = name;
    this.wheelcount = wheelcount;
    this.isHumanPowered = isHumanPowered;
  }

  public String name(){return "Bicycle";}

  public int wheelCount(){return 2}

  public boolean isHumanPowered{return true}

  private String name;
  private int wheelCount;
  private boolean isHumanPowered;

}

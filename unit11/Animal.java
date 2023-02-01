
public class Animal{

  public Animal(String name, int legcount, boolean furriness){
    this.name = name;
    this.legcount = legcount;
    this.furriness = furriness;
  }

  public String name(){return name;}

  public int legCount(){return legcount;}

  public boolean isFurry(){return furriness;}


  private String name;
  private int legcount;
  private boolean furriness;

}

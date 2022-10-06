public class vamp{

  public static void testVamp(float hour, boolean awake, boolean expected){
    boolean isVamp = isVamp(hour, awake);
    System.out.println("hour: " + hour + " expected: "
                      + expected + " result: " + awake);

    if(expected == awake){
      System.out.println("Woohoo!");
    }else{
      System.out.println("Boohoo!");
    }
  }
  public static boolean isVamp(float hour, boolean awake){
    if(hour < 6 || hour > 22){
      return true;
    }else{
      return false;
    }
  }
  public static void main(String[] args){
    testVamp(7.3f, false, false);
    testVamp(23.0f, false, false);
    testVamp(1.2f, true, true);
    testVamp(22.2f, false, false);
  }
}

public class icyHot{

  public static void testicyHot(int temp1, int temp2, boolean expected){
        boolean icyHot = icyHot(temp1, temp2);

        System.out.println("temp1: " + temp1 + " temp2: " + temp2 +
                " expected: " + expected + " result: " + icyHot);

        if (icyHot == expected){
            System.out.println(" Woohoo!");
        }else{
            System.out.println(" Boohoo!");
    }
  }

    public static boolean icyHot(int temp1, int temp2) {
    return ((temp1 < 0 || temp2 < 0) && (temp1 > 100 || temp2 > 100));
  }

    public static void main(String[] args){
        testicyHot(100, 20, false);
        testicyHot(-35, 120, true);
        testicyHot(-1, 10, false);
    }
}

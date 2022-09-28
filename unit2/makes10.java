public class makes10{

  public static void testmakes10(int a, int b, boolean expected){
        boolean makes10 = makes10(a, b);

        System.out.println("a: " + a + " b: " + b +
                " expected: " + expected + " result: " + makes10);

        if (makes10 == expected){
            System.out.println(" Woohoo!");
        }else{
            System.out.println(" Boohoo!");
    }
  }

  public static boolean makes10(int a, int b) {
      return ((a==10 || b == 10) || (a+b==10));
}

    public static void main(String[] args){
        testmakes10(10, 2, true);
        testmakes10(6, 4, true);
        testmakes10(20, 1, false);
    }
}

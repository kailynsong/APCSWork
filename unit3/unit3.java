public class unit3{

  public static void testGreeting(String name,String expected){
    String greetings = greetings(name);

    System.out.println("name: " + name + "  expected: "
                      + expected + " result: " + greetings);

    if(greetings.equals(expected)){
      System.out.println("Woohoo!");
    }else{
      System.out.println("Boohoo!");
    }
  }

  public static void testAttention(String str, boolean expected){
    boolean attention = attention(str);

    System.out.println("person: " + str + " expected: " +
                      expected + " result: " + attention);

    if(attention == expected){
      System.out.println("Woohoo!");
    }else{
      System.out.println("Boohoo!");
    }
  }

  public static String greetings(String name){
    return ("Hello, " + name + ", how are you?");
  }

  public static boolean attention(String str){
    String m = "Hey you!";
    return (str.substring(0,8).equals(m));
  }

  public static String coinflip(){
    if(Math.random() < 0.5){
      return "Heads";
    }else{
      return "Tails";
    }
  }
  public static int dice(){
    return (int)(Math.random()*6 + 1);
  }
  public static void main(String[] args){
    System.out.println(greetings("Kailyn"));
    System.out.println(greetings("Dr. Kessner"));

    System.out.println();

    testGreeting("Kailyn", "Hello, Kailyn, how are you?");
    testGreeting("Dr. Kessner", "Hello, Dr. Kessner, how are you?");

    System.out.println();

    System.out.println(attention("Excuse me, Dr. Kessner?"));
    System.out.println(attention("Hey you! Stop!"));

    System.out.println();
    testAttention("Excuse me, Dr. Kessner?", false);
    testAttention("Hey you! Stop!", true);

    System.out.println();

    for(int i = 0; i < 11; i++){
    System.out.println(coinflip());
}
    System.out.println();
    for(int i = 0; i < 6; i++){
    System.out.println(dice());
  }
  }
}

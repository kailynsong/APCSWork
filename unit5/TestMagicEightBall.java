
public class TestMagicEightBall{

  public static void main(String[] args){

    MagicEightBall a = new MagicEightBall();
    System.out.println(a.ask("Did I fail my test?"));

    MagicEightBall b = new MagicEightBall();
    System.out.println(b.ask("Should I do my homework?"));
  }

}


public class MagicEightBall{

  private final String rep = "It is certain.";
  private final String rep1 = "Most likely";
  private final String rep2 = "Yes.";
  private final String rep3 = "Reply hazy, try again.";
  private final String rep4 = "Better not tell you now.";
  private final String rep5 = "Cannot predict now.";
  private final String rep6 = "Don't count on it.";
  private final String rep7 = "My reply is no.";
  private final String rep8 = "Very doubtful";
  private final String rep9 = "No.";

  public MagicEightBall(){
  }

  public String ask(String question){
    if(Math.random() <= .1)
      return rep;

    else if(Math.random() > .1 && Math.random() <= .2)
      return rep1;

    else if(Math.random() > .2 && Math.random() <= .3)
      return rep2;

    else if(Math.random() > .3 && Math.random() <= .4)
      return rep3;

    else if(Math.random() > .4 && Math.random() <= .5)
      return rep4;

    else if(Math.random() > .5 && Math.random() <= .6)
      return rep5;

    else if(Math.random() > .6 && Math.random() <= .7)
      return rep6;

    else if(Math.random() > .7 && Math.random() <= .8)
      return rep7;

    else if(Math.random() > .8 && Math.random() <= .9){
      return rep8;
    }else{
      return rep9;
    }

  }



}

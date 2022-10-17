
public class ScoreKeeper{

  private int score = 0;

  public ScoreKeeper(int scoreIn){
    score = scoreIn;
  }
  public int scoreNormal(){
    return(score+=100);
  }
  public int scoreBonus(){
    return(score+=1000);
  }

}

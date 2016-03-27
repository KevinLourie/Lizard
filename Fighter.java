//Scissors beats paper, paper beats rock, rock beats lizard, lizard beats Spock, Spock beats scissors, scissors beats lizard, lizard beats paper, paper beats Spock, Spock beats rock, rock beats scissors
import java.util.*;
import java.security.*;

public enum Fighter {
        
   Rock,
   Paper,
   Scissors,
   Lizard,
   Spock;
   
         
              
   static {
      Rock.init(Paper, Spock);
      Paper.init(Scissors, Lizard);
      Scissors.init(Rock, Spock);
      Lizard.init(Scissors, Rock);
      Spock.init(Paper, Lizard);
   }
    
   private Fighter mLosesTo1;
   private Fighter mLosesTo2;
   
   public void init(Fighter losesTo1, Fighter losesTo2) {
      mLosesTo1 = losesTo1;
      mLosesTo2 = losesTo2;
   }
   
   public Outcome determineOutcome (Fighter fighter) {
   
      if (this == fighter) {
         return Outcome.Tie;
      }
      if (fighter == mLosesTo1 || fighter == mLosesTo2) {
         return Outcome.Lose;
      }
      return Outcome.Win;
   }
   
   public static Fighter chooseRandomFighter() {
      Random rand = new SecureRandom();
      // sets num to an index of a random fighter
      int num = rand.nextInt(values().length);
      // returns fighter that has the index num
      return values()[num];
   }
   
   public static void printMenu() {
      for (int i = 0; i < values().length; i++) {
         System.out.println(i + " " + values()[i]);
      }
   }
}  
  
   

  



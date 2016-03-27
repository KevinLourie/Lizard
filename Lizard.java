import java.util.*;

public class Lizard {
   public static void main (String[ ] args) {   
     // Computer chooses a fighter
      Fighter computerFighter = Fighter.chooseRandomFighter();
     
      // The user chooses a fighter
      Fighter.printMenu();
      Scanner sc = new Scanner(System.in);
      int i = sc.nextInt();
      
      // Determine outcome and then show user
   
      // Assigns fighter that has the index i to yourFighter
      Fighter yourFighter = Fighter.values()[i];
      System.out.println("You choose " + yourFighter);
      System.out.println("Computer chooses " + computerFighter);

      System.out.println("Outcome for computer is: " + computerFighter.determineOutcome(yourFighter));
   }
}
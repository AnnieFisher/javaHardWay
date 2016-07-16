import java.util.Scanner;

public class CoinFlip {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String coin, again;
    int streak = 0;
    boolean gotHeads;
    //in most coding of  games instead of the boolean could just use
    //double flip;

    do
    {
      gotHeads = Math.random() < 0.5;
      // flip = Math.rand()

      if (gotHeads)
      //if (flip < 0.5)
        coin = "HEADS";
      else
        coin = "TAILS";

      System.out.println("You flip a coin and it is... " +coin);

      if (gotHeads) {
      //if (flip < 0.5)
        streak++;
        System.out.println("\tThat's " +streak +" in a row...");
        System.out.print("\tWould you like to flip again (y/n)? ");
        again = keyboard.next();
      }
      else {
        System.out.println("\tYou lose everything!");
        System.out.println("\t Should've quit while you were aHEAD...");
        streak = 0;
        again = "n";
      }
    } while (again.equals("y"));
    System.out.println("Final score: " +streak );
  }
}

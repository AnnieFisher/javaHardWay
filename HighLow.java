import java.util.Scanner;

public class HighLow {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int secret, guess;

    //secret = 1 + (int)(100*Math.random());
    secret = 30;

    System.out.println("I'm thinking of a number between 1-100.");
    System.out.println("Try to guess it!");
    System.out.print("> ");
    guess = keyboard.nextInt();

    while (secret != guess) {
      if (guess < secret) {
        System.out.print("Sorry, your guess is too low. ");
        //guess = keyboard.nextInt();
      }
      if (guess > secret) {
        System.out.print("Sorry, your guess is too high. ");
        //guess = keyboard.nextInt();
      }
        System.out.print("Try again > ");
        guess = keyboard.nextInt();
    }
    System.out.println(secret +"! You guessed it! What are the odds?!?");
  }
}

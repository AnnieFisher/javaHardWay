import java.util.Scanner;

public class EnterPin {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String password;

    pin = 12345;
    password = "Hello";

    System.out.println("WELCOME TO THE BANK OF JAVA.");
    System.out.println("ENTER YOUR PASSWORD.");
    password = keyboard.next();

    while (! password.equals("Hello")) {
      System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
      System.out.println("ENTER YOUR PASSWORD.");
      password = keyboard.next();
      }

    System.out.print("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while (entry !=pin) {
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }

    System.out.println("\nPIN ACCEPTED. YOU ACCOUNT BALANCE IS $425.17");
  }
}

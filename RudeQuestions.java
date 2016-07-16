import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args) {
    String name, height;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hello. What is your name? ");
    name = keyboard.next();

    System.out.print("Hi, " +name +"! How old are you? ");
    age = keyboard.nextInt();

    System.out.println("So you're " +age + ", eh? That's not very old.");
    System.out.print("How much do you weigh, " +name + "? ");
    weight = keyboard.nextDouble();

    System.out.println(weight +"! Better keep that quiet!!");
    System.out.print("Finally, what's your income, " +name + "? ");
    income = keyboard.nextDouble();

    System.out.print("Hopefully that is " +income +" per hour");
    System.out.println(" and not per year!");
    System.out.print("Well, thanks for answering my rude questions, ");
    System.out.println(name +".");

    System.out.print(name +", I have just one more question. How tall are you? ");
    height = keyboard.next();
  }
  //1) A double can be an integer so it will not blow the program up.
  /*2) The program works fine with a numeric value, even with decimals.
       A string is 1+ characters in a row. Numerals are character values,
       and therefore can be defined with binary values within ASCII.*/
  /*3) Due to above answer the program will not blow up on the first question
       no matter what is typed in on the keyboard. The double variables will not
       accept alphabetic characters.*/
  /*  I originally declared height as a double variable, however I realized
      most would not type in inches. So I put it as a string so there would
      be less chance of error on the users part.*/
}

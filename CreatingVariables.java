public class CreatingVariables {
  public static void main(String[] args) {
    int x, y, age, year;
    double seconds, e, checking, minutes;
    String firstName, lastName, title, schoolName, acceptance;

    x = 10;
    y = 400;
    age = 39;
    year = 2016;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    minutes = 409;


    firstName = "Annie";
    lastName = "Fisher";
    title = "Ms.";
    schoolName = "Skill Distillery";
    acceptance = "admission work and pre-work";

    System.out.println("The variable x contains " + x);
    System.out.println("The value " + y + " is stored in the variable y.");
    System.out.println("The experiment took " + seconds + " seconds.");
    System.out.println("A favorite irrational # is Euler's number: " + e);
    System.out.println("Hopefully you have more than $" + checking + "!");
    System.out.println("My name is " + title + " " + firstName + " " + lastName);
    System.out.print("It took me, " + title + " " + firstName + " " + lastName);
    System.out.print(", " + minutes + " minutes to complete " + schoolName + "'s ");
    System.out.println(acceptance + " thus far.");

  }
}

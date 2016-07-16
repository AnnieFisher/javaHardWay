import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double i, height, lbs, kg, m, bmi;
    int f;

    System.out.print("Your height (feet only): ");
    f = keyboard.nextInt();

    System.out.print("Any extra inches to add?: ");
    i = keyboard.nextDouble();

    System.out.print("Your weight in pounds: ");
    lbs = keyboard.nextDouble();

    height = f*12+i;
    kg = lbs*0.45;
    m = height*0.025;
    bmi = kg/(m*m);

    System.out.println("Your BMI is " +bmi);

  }
}

public class MathOperations {
  public static void main(String[] args) {
    int a, b, c, d, e, f, g;
    double x, y, z, p, r, area, di, ci, unknown, m;
    String one, two, both;

    a = 10;
    b = 27;
    System.out.println("a is " + a + ", b is " + b);

    c = a+b;
    System.out.println("a+b is " +c);
    d = a-b;
    System.out.println("a-b is " +d);
    e = a+b*3;
    System.out.println("a+b*3 is " +e);
    f = b/2;
    System.out.println("b/2 is " +f);
    g = b%10;
    System.out.println("b%10 is " +g);

    x = 1.1;
    System.out.println("\nx is " +x);
    y = x*x;
    System.out.println("x*x is " +y);
    z = b/2;
    System.out.println("b/2 is " +z);
    System.out.println();

    one = "dog";
    two = "house";
    both = one + two;
    System.out.println(both);

    p = 3.14159;
    r = 5.2;
    area = p*r*r;
    System.out.println("Tht area of the circle is: " +area);
    di = r*2;
    ci = p*di;
    m = p%2;
    System.out.println("The diameter is: " +di +"\nThe circumference is: " +ci);
    System.out.println("If my algebra is not too rusty, the radius should equal: " + di/2);
    unknown = di+r-p;
    System.out.println("The value of trying to use the remaining equation expressions is: " +unknown);
    System.out.println("The modular of pi is: " +m);
  }

}

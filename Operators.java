/*public class Operators{
  public static void main(String[] args) {
    int a = 10;
    int b = 5;

    // arithmetic

    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(a % b);

    // relational

    System.out.println(a > b);

    // logical

    System.out.println(a > 3 && b < 4);

    // ternary

    String result = (a > b) ? "a is bigger than b" : "b is bigger than a";

    System.out.println(result);

  }
}*/

class Operators{
  public static void  main (String[] args) {
    //arithmetic operators

    //integers
    int a = 45;
    int b = 35;

    //strings
    String n1 = "67";
    String n2 = "46";

    //convert string to integers
    int a1 = Integer.parseInt(n1);
    int b1 = Integer.parseInt(n2);

    arithmetic(a, b, a1, b1);
    
  }
  public static void arithmetic(int a, int b, int a1, int b1) {
    System.out.println("sum: " + (a+b));
    System.out.println("sub: " + (a-b));
    System.out.println("multiply: " + (a1*b1));
    System.out.println("reminder: " + (a1%b1));
  }
}

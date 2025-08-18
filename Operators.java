public class Operators{
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
}
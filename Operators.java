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

    //integers
    int a = 45;
    int b = 35;

    //strings
    String n1 = "67";
    String n2 = "46";

    //convert string to integers
    int a1 = Integer.parseInt(n1);
    int b1 = Integer.parseInt(n2);

    //booleans
    boolean boo1 = true;
    boolean boo2 = false;

    arithmetic(a, b, a1, b1);
    Unary(a, b);
    Logical(boo1, boo2);
    
  }

  //arithmetic operators
  public static void arithmetic(int a, int b, int a1, int b1) {
    System.out.println("sum: " + (a+b));
    System.out.println("sub: " + (a-b));
    System.out.println("multiply: " + (a1*b1));
    System.out.println("reminder: " + (a1%b1));
  }

  //unary operator
  public static void Unary(int a, int b){
    System.out.println("pre-increment: " + (++a));
    System.out.println("post-increment: " + (a++));
    System.out.println("pre-decrement: " + (--b));
    System.out.println("post-decrement: " + (b--));
  }

  //logical operators
  public static void Logical(boolean boo1, boolean boo2){
    System.out.println("if both the condition are true: " + (boo1 && boo2));
    System.out.println("if any one of the condition is true: " + (boo1 || boo2));
    System.out.println("used to reverse the condition: " + (!boo1));
  }
}

class Gfg{
  public static void main(String[] args) {
    final int age = 43;

    // using if-else statement
    if (age > 50) {
      System.out.println("you are above 50");
    } else {
      System.out.println("you are below 50");
    }
    CheckBooleans();
    FloatsInJava();
  }

  public static void CheckBooleans() {
    boolean b1 = true;
    boolean b2 = false;

    System.out.println("is java really fun?" + b1);
    System.out.println("is fish tasty?" + b2);
  }

  public static void FloatsInJava() {
    float pi = 3.14f;
    float gravity = 9.81f;

    System.out.println("value of pi is " + pi);
    System.out.println("value of gravity is " + gravity);
  }
}
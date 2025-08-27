public class Factorial {
  static int fact(int n) {
    if ( n==0 ) return 1; // base call
    return n * fact( n-1 ); // recursive call
  }

  public static void main(String[] args) {
    System.out.println(" 5! = " + fact(5));
  }
}
class Operators {
  public static double Square(int a) {
    return a * a;
  }
  public static double Rectangle(int l, int b) {
    return l * b;
  }
  public static double Triangle(int b, int h) {
    return 0.5 * b * h;
  }
  public static void main(String[] args) {
   double areaOfSquare =  Square(62);
   double areaOfRectangle = Rectangle(67, 58);
   double areaOfTriangle = Triangle(23, 53);

   System.out.println(areaOfSquare);
   System.out.println(areaOfRectangle);
   System.out.println(areaOfTriangle);
   
  }
}
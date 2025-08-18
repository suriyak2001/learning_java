class Demo{
  public static void main(String [] args) {

    int number1 = 15;
    int number2 = 25;
    Calculator calc = new Calculator();
    int result = calc.add(number1, number2);
    System.out.println(result);

  }
}

class Calculator {
  public int add(int n1, int n2){
    return n1 + n2;
  }
}
import java.util.Scanner;

public class additionQuiz {
  public static void main(String [] args) {
    int num_1 = (int) (System.currentTimeMillis() % 10);
    int num_2 = (int) (System.currentTimeMillis() / 7 % 10);

    // create a scanner
    Scanner input = new Scanner(System.in);

    System.out.println("what is " + num_1 + " + " + num_2 + " ? ");

    int number = input.nextInt();

    System.out.println(
      num_1 + " + " + num_2 + " = " + number + " is " + 
      (num_1 + num_2 == number)
    );
    
  }
}
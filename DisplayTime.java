import java.util.Scanner;


public class DisplayTime{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // prompt the user for the input
    System.out.println("enter the integer for seconds: ");

    int seconds = input.nextInt();

    int minutes = seconds / 60; // finding minutes from seconds
    int remainingSeconds = seconds % 60; // finding remaining seconds

    System.out.println(seconds + " seconds is" + minutes + " minutes and" + remainingSeconds + " seconds");
  }
}
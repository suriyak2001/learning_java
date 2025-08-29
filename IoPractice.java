import java.util.Scanner;

public class IoPractice{
  public static void main(String[] args) {

    // creating a scanner object to store the inputs
    Scanner input = new Scanner(System.in);

    System.out.println("welcome to java I/O practice");

    // entering Input
    System.out.println("enter your name:");
    String name = input.nextLine();

    System.out.println("enter your age:");
    int age = input.nextInt();

    System.out.println("enter your gpa: ");
    double gpa = input.nextDouble();

    System.out.println("hello " + name + "!");
    System.out.println("age: " + age + ", GPA: " + gpa);

    input.close(); 
  }
}
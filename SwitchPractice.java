public class SwitchPractice{
  public static void main(String[] args) {
    int day = 3;

    // using switch statement
    switch (day) {
      case 1:
        System.out.println("monday");
        break;
      case 2:
        System.out.println("tuesday");
        break;
      case 3:
        System.out.println("wednesday");
        break;
      case 4:
        System.out.println("thursday");
        break;
      case 5:
        System.out.println("friday");
        break;
      default:
        System.out.println("weekend");        
    }
  }
}
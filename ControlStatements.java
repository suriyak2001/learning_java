public class ControlStatements {
  public static void main (String[] args) {
    int num = 2;

    // if-else

    if (num > 7) {
        System.out.println("the number is greater than 7");
    } else {
      System.out.println("the number is less than 7");
    }

    // switch 

    switch (num) {
      case 1: {
        System.out.println("one");
        break;
      }
      case 2: {
        System.out.println("two");
        break;
      }
      case 3: {
        System.out.println("three");
        break;
      }
      default: {
        System.out.println("other number");
      }
    }

    // for-loop

    for(int i = 1; i <= 4; i++) {
      System.out.println("for loop: "+i);
    }

    // while-loop

    int j = 1;
    while (j <= 3) {
      System.out.println("while loop: " + j);
      j++;
    }

    // do while

    int k = 1; 
    do {
      System.out.println("do while loop: " + k);
      k++;
    }while (k < 1);
  }
}
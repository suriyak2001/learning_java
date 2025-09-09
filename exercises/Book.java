class Details{
  String title;
  String author;
  double price;

  Details(String title, String author, double price) {
    this.title = title;
    this.author = author;
    this.price = price;
  }

  void displayDetails() {
    System.out.println("title: " + title);
    System.out.println("author: " + author);
    System.out.println("price: " + price);
  }
}
public class Book {
  public static void main(String[] args) {
    Details myBook = new Details("GOT", "John Snow", 2345); // this creates an object
    
    myBook.displayDetails(); // calling the method
  }
}


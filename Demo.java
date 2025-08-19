class Demo{
  
  public static void main(String [] args) {
    Computer obj = new Computer();

    obj.playMusic();
    String str = obj.getAPen();
    System.out.println(str);
  }
}

class Computer {
  
  public void playMusic() {

    System.out.println("playing music");
  
  }

  public String getAPen() {
    return "pen";
  }
}

public class Sharpie {

  String color;
  float width;
  float inkAmount;

  public Sharpie(){
    inkAmount = 100;
  }

  public Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
  }

  public void use() {
    inkAmount = inkAmount-5;
  }
}

public class Fox {

  String type;
  String color;
  String name;

  public Fox(String name, String color, String type) {
    this.name = name;
    this.color = color;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public String getColor() {
    return color;
  }

  public String toString() {
    return getName();
  }


}

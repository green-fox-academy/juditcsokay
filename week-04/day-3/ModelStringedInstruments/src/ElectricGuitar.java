public class ElectricGuitar extends StringedInstruments {

  public ElectricGuitar(){
    name = "Electric guitar";
    numberOfStrings = 6;
  }

  public ElectricGuitar(String name) {
    super(name);
  }

  public ElectricGuitar(int numberOfStrings) {
    name = "Electric guitar";
    this.numberOfStrings = numberOfStrings;
  }

  public ElectricGuitar(String name, int numberOfStrings) {
    super(name, numberOfStrings);
  }

  public String sound() {
    return "Twang";
  }
}

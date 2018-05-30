public class BassGuitar extends StringedInstruments {

  public BassGuitar(){
    name = "Bassguitar";
    numberOfStrings = 4;
  }

  public BassGuitar(String name) {
    super(name);
  }

  public BassGuitar(int numberOfStrings) {
    name = "Bassguitar";
    this.numberOfStrings = numberOfStrings;
  }

  public BassGuitar(String name, int numberOfStrings) {
    super(name, numberOfStrings);
  }

  public String sound() {
    return "Duum-duum-duum";
  }
}

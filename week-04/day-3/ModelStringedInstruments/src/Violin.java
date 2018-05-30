public class Violin extends StringedInstruments {

  public Violin(){
    name = "Violin";
    numberOfStrings = 4;
  }

  public Violin(String name) {
    super(name);
  }

  public Violin(int numberOfStrings){
    name = "Violin";
    numberOfStrings = this.numberOfStrings;
  }

  public Violin(String name, int numberOfStrings) {
    super(name, numberOfStrings);
  }

  public String sound() {
    return "Screech";
  }
}

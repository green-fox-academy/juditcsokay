import main.java.music.Instrument;

public abstract class StringedInstruments extends Instrument {

  int numberOfStrings;

  public StringedInstruments(){}

  public StringedInstruments(String name) {
    super(name);
  }

  public StringedInstruments(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public StringedInstruments(String name, int numberOfStrings) {
    super(name);
    this.numberOfStrings = numberOfStrings;
  }

  public int getNumberOfStrings() {
    return numberOfStrings;
  }

  public void setNumberOfStrings(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public abstract String sound();

  public void play(){
    System.out.println(name + " is a "  + numberOfStrings + "-stringed instrument that goes " + sound());
  }
}

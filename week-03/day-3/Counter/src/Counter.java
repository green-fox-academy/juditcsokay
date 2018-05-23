public class Counter {
  int initialValue;
  int storedValue;

  public Counter() {
    this.initialValue = 0;
  }

  public Counter(int initialValue) {
    this.initialValue = initialValue;
    storedValue = initialValue;
  }

  public void add(int number) {
    initialValue =+ number;
  }

  public void add() {
    initialValue++;
  }

  public int get(){
    return initialValue;
  }

  public void reset() {
    initialValue = storedValue;
  }

  public static void main(String[] args) {

  }
}

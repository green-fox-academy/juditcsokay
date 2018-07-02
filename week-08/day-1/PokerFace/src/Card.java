public class Card {

  private String name;
  private String suit;
  private int value;

  public Card(String suit, int value, String name) {
    this(suit, value);
    this.name = suit + name;
  }

  public Card(String suit, int value) {
    name = suit + value;
    this.suit = suit;
    this.value = value;
  }

  public String getSuit() {
    return suit;
  }

  public void setSuit(String suit) {
    this.suit = suit;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

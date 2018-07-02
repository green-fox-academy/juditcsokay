import java.util.ArrayList;
import java.util.List;

public class Deck {

  private List<Card> deck;

  public Deck() {
    deck = new ArrayList<>();
    deck.add(new Card("H", 2));
    deck.add(new Card("H", 3));
    deck.add(new Card("H", 4));
    deck.add(new Card("H", 5));
    deck.add(new Card("H", 6));
    deck.add(new Card("H", 7));
    deck.add(new Card("H", 8));
    deck.add(new Card("H", 9));
    deck.add(new Card("H", 10));
    deck.add(new Card("H", 11, "J"));
    deck.add(new Card("H", 12, "Q"));
    deck.add(new Card("H", 13, "K"));
    deck.add(new Card("H", 14, "A"));

    deck.add(new Card("D", 2));
    deck.add(new Card("D", 3));
    deck.add(new Card("D", 4));
    deck.add(new Card("D", 5));
    deck.add(new Card("D", 6));
    deck.add(new Card("D", 7));
    deck.add(new Card("D", 8));
    deck.add(new Card("D", 9));
    deck.add(new Card("D", 10));
    deck.add(new Card("D", 11, "J"));
    deck.add(new Card("D", 12, "Q"));
    deck.add(new Card("D", 13, "K"));
    deck.add(new Card("D", 14, "A"));

    deck.add(new Card("S", 2));
    deck.add(new Card("S", 3));
    deck.add(new Card("S", 4));
    deck.add(new Card("S", 5));
    deck.add(new Card("S", 6));
    deck.add(new Card("S", 7));
    deck.add(new Card("S", 8));
    deck.add(new Card("S", 9));
    deck.add(new Card("S", 10));
    deck.add(new Card("S", 11, "J"));
    deck.add(new Card("S", 12, "Q"));
    deck.add(new Card("S", 13, "K"));
    deck.add(new Card("S", 14, "A"));

    deck.add(new Card("C", 2));
    deck.add(new Card("C", 3));
    deck.add(new Card("C", 4));
    deck.add(new Card("C", 5));
    deck.add(new Card("C", 6));
    deck.add(new Card("C", 7));
    deck.add(new Card("C", 8));
    deck.add(new Card("C", 9));
    deck.add(new Card("C", 10));
    deck.add(new Card("C", 11, "J"));
    deck.add(new Card("C", 12, "Q"));
    deck.add(new Card("C", 13, "K"));
    deck.add(new Card("C", 14, "A"));
  }

  public List<Card> getDeck() {
    return deck;
  }

  public void setDeck(List<Card> deck) {
    this.deck = deck;
  }
}

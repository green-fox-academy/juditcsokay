import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hand {

  List<Card> black;
  List<Card> white;
  Deck deck;

  public Hand() {
    black = Arrays.asList(new Card("H", 2), new Card("D", 3), new Card("S", 5),
            new Card("C", 9), new Card("D", 13, "K"));
    white = Arrays.asList(new Card("C", 2), new Card("H", 3), new Card("S", 4),
            new Card("C", 8), new Card("H", 14, "A"));
    deck = new Deck();
  }

  /*private void getBlack(List<Card> deck) {
    while (black.size() != 5) {
      int randomCardIndex = (int)(Math.random() * deck.size());
      if (!black.contains(randomCardIndex)) {
        black.add(deck.get((randomCardIndex)));
      }
    }
  }

  private void getWhite(List<Card> deck) {
    while (white.size() != 5) {
      int randomCardIndex = (int)(Math.random() * deck.size());
      if (!black.contains(randomCardIndex) && !white.contains(randomCardIndex)) {
        white.add(deck.get((randomCardIndex)));
      }
    }
  }*/

  public List<Card> getBlack() {
    return black;
  }

  public void setBlack(List<Card> black) {
    this.black = black;
  }

  public List<Card> getWhite() {
    return white;
  }

  public void setWhite(List<Card> white) {
    this.white = white;
  }
}

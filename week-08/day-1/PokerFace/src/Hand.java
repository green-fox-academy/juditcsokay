import java.util.ArrayList;
import java.util.List;

public class Hand {

  List<Card> handOne;
  List<Card> handTwo;
  Deck deck;

  public Hand() {
    handOne = new ArrayList<>();
    deck = new Deck();
    getHandOne(deck.getDeck());
  }

  public static void main(String[] args) {
    Hand hand = new Hand();
    for (int i = 0; i < hand.handOne.size(); i++) {
      System.out.println(hand.handOne.get(i).getName());
    }
  }

  private void getHandOne(List<Card> deck) {
    while (handOne.size() != 5) {
      int randomCardIndex = (int)(Math.random() * deck.size());
      if (!handOne.contains(randomCardIndex)) {
        handOne.add(deck.get((randomCardIndex)));
      }
    }
  }
}

import java.util.List;

public class Rules {

  Hand hand;

  public Rules() {
    hand = new Hand();
  }

  public Hand getHand() {
    return hand;
  }

  public void setHand(Hand hand) {
    this.hand = hand;
  }

  public int getHighestCard(Hand hand) {
    int blackMaxValue = getHand().getBlack().get(0).getValue();
    int whiteMaxValue = getHand().getWhite().get(0).getValue();

    for (int i = 0; i < getHand().getBlack().size(); i++) {
      if (getHand().getBlack().get(i).getValue() > blackMaxValue) {
        blackMaxValue = getHand().getBlack().get(i).getValue();
      }
    }
    for (int i = 0; i < getHand().getWhite().size(); i++) {
      if (getHand().getWhite().get(i).getValue() > whiteMaxValue) {
        whiteMaxValue = getHand().getWhite().get(i).getValue();
      }
    }
    if (blackMaxValue > whiteMaxValue) {
      return blackMaxValue;
    }
    return whiteMaxValue;
  }

}

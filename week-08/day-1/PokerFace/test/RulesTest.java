import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RulesTest {

  Rules rules = new Rules();

  @Test
  public void should_getHighCardResult() {
    Hand hand = new Hand();

    int expectedResult = hand.getWhite().get(4).getValue();
    int result = rules.getHighestCard(hand);

    assertEquals(expectedResult, result);
  }

}
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppleTest {

  @Test
  public void should_returnApple_when_getAppleCalled() {
    Apple apple = new Apple();
    String expectedResult = "apples";

    String result = apple.getApple();

    assertEquals(expectedResult, result);
  }
}

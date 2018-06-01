import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;

public class AnagramTest {

  static Anagram anagram;

  @BeforeClass
  public static void init() {
    anagram = new Anagram();
  }

  @Test
  public void should_returnFalse_when_oneOfTheInputsIsNull() {
    String wordOne = "alma";
    boolean expectedResult = false;
    boolean result = anagram.anagram(wordOne, null);

    assertEquals(expectedResult, result);
  }

  @Test
  public void should_returnFalse_when_oneOrBothInputsAreEmptyStrings() {
    String wordOne = "";
    String wordTwo = "";
    boolean expectedResult = true;
    boolean result = anagram.anagram(wordOne, wordTwo);

    assertEquals(expectedResult, result);
  }

  @Test
  public void should_returnFalse_when_bothOfTheInputsIsNull() {
    boolean expectedResult = false;
    boolean result = anagram.anagram(null, null);

    assertEquals(expectedResult, result);
  }

  @Test
  public void should_returnTheRightResult_when_thereAreSomeCapitalLetter() {
    String wordOne = "Alma";
    String wordTwo = "alAm";

    boolean expectedResult = true;
    boolean result = anagram.anagram(wordOne, wordTwo);

    assertEquals(expectedResult, result);
  }

  @Test
  public void should_returnTheRightResult_when_thereAreSpacesInTheStrings() {
    String wordOne = "Akinek a hat alma sok.";
    String wordTwo = "Kenika  a  tah alam   kos.";

    boolean expectedResult = true;
    boolean result = anagram.anagram(wordOne, wordTwo);

    assertEquals(expectedResult, result);
  }

}
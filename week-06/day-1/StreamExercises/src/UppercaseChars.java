import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UppercaseChars {

  public static void main(String[] args) {

    String testText = "Write a Stream Expression to find the uppercase characters in a string!";

    System.out.println(getUppercaseCharacters(testText));
  }

  private static List<Character> getUppercaseCharacters(String testText) {
    return testText.chars()
            .mapToObj(item -> (char) item)
            .filter(Character::isUpperCase)
            .collect(Collectors.toList());

  }
}

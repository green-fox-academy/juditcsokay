import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacters {

  public static void main(String[] args) {
    
    String testText = "Write a Stream Expression to find the frequency of characters in a given string!";

    System.out.println(getCharacterFrequency(testText));
  }

  private static Map<Character, Long> getCharacterFrequency(String testText) {
    return testText.chars()
            .mapToObj(c -> (char) c)
            .map(Character::toLowerCase)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
  }
}

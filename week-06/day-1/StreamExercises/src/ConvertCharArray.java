import java.util.Arrays;

public class ConvertCharArray {

  public static void main(String[] args) {

    Character[] characters = {'n','o','g','u','c','h','i','s','o','i','c','h','i'};

    System.out.println(getStringFromChars(characters));
  }

  private static String getStringFromChars(Character[] characters) {
    return Arrays.stream(characters)
            .map(c -> Character.toString(c))
            .reduce((text, word) -> text + word)
            .get();
  }


}

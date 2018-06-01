import java.util.Arrays;

public class Anagram {

  public static boolean anagram(String wordOne, String wordTwo) {
    if (wordOne == null || wordTwo == null) {
      return false;
    } else {
      String replacedWordOne = stringSplitter(wordOne);
      String replacedWordTwo = stringSplitter(wordTwo);
      Arrays.sort(splittedWordOne);
      Arrays.sort(splittedWordTwo);
      if (splittedWordOne.length == splittedWordTwo.length) {
        for (int i = 0; i < splittedWordOne.length; i++) {
            if (splittedWordOne[i] == splittedWordTwo[i]) {
              break;
            }
          }
      } else {
        return false;
      }
    }
  }

  private static String stringSplitter(String wordOne) {
    return wordOne.replace("[\\s]", "");
  }

  private static String stringConcat(String[] splittedWordOne) {
    String concatenated = "";
    for (int i = 0; i < splittedWordOne.length; i++) {
      concatenated=concatenated.concat(splittedWordOne[i]);
    }
    return concatenated;
  }

  public static void main(String[] args) {
    System.out.println(anagram("aaa", "abb"));
  }
}

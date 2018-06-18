import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StartsWidthA {

  public static void main(String[] args) {

    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA",
            "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

    System.out.println(getWordsStartsWidthAEndsWidthI(cities));
  }

  private static List<String> getWordsStartsWidthAEndsWidthI(ArrayList<String> cities) {
    return cities.stream()
            .filter(s -> s.startsWith("A"))
            .filter(s -> s.endsWith("I"))
            .collect(Collectors.toList());
  }
}

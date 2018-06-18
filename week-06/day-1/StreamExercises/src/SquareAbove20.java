import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareAbove20 {

  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

    System.out.println(getSquaresAboveTwenty(numbers));
  }

  public static List<Integer> getSquaresAboveTwenty(ArrayList<Integer> numbers){
    return numbers.stream()
            .mapToInt(n -> n * n)
            .filter(n -> n > 20)
            .boxed()
            .collect(Collectors.toList());
  }
}

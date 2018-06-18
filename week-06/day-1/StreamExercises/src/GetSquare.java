import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetSquare {

  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    System.out.println(getSquareOfPositiveNumbers(numbers));
  }

  public static List<Integer> getSquareOfPositiveNumbers(ArrayList<Integer> numbers) {
    return numbers.stream()
            .filter(n -> n > 0)
            .mapToInt(n -> n * n)
            .boxed()
            .collect(Collectors.toList());
  }
}

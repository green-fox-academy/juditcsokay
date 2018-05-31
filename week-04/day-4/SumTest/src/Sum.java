import java.util.ArrayList;

public class Sum {

  public static int sum(int[] numbers) {
    if (numbers == null) {
      return 0;
    }
    int sum = 0;
    for (int num : numbers) {
      sum += num;
    }
    return sum;
  }

}

import java.lang.reflect.Array;
import java.util.Arrays;

public class Unique {
  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once

    //  Example
    int[] list = {1, 11, 34, 11, 52, 61, 1, 34};
    list = makeUnique(list);
    for (int row : list) {
      System.out.println(row);
    }

    //System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`
  }

  private static int[] makeUnique(int[] parameterList) {
    int[] uniqueList = new int[parameterList.length];
    int n = 0;
    boolean mindfuck = true;
    for (int i = 0; i < parameterList.length; i++) {
      for (int j = 0; j < uniqueList.length; j++) {
        if(parameterList[i] == uniqueList[j]) {
          mindfuck = false;
          break;
        }

        mindfuck = true;
      }
      if(mindfuck) {
        uniqueList[n] = parameterList[i];
        n++;
      }
    }
    return uniqueList;
  }
}
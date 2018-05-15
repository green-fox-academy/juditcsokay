import java.util.*;

public class ElementFinder{
  public static void main(String... args){
    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    ArrayList<Integer> arrayListTwo = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 9, 21, 7, 4, 3, 8));
    System.out.println(containsEight(arrayListTwo));
    System.out.println(containsSeven(arrayList));
    //containsEight(arrayListTwo);
    // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
    // The output should be: "Noooooo"
    // Do this again with a different solution using different list methods!
  }

  private static String containsEight(ArrayList<Integer> arrayListTwo) {
    String solution = "Noooooo!";
    for (int i = 0; i < arrayListTwo.size(); i++) {
      if (arrayListTwo.get(i) == 8) {
        solution = "Hoorray!";
      } else {}
    }
    return solution;
  }

  private static String containsSeven(ArrayList<Integer> arrayList) {
    if (arrayList.contains(7)) {
      return "Hoorray!";
    } else {
      return "Noooooo";
    }
  }



}

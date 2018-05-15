import java.lang.reflect.Array;
import java.util.*;

public class MatchMaking{
  public static void main(String... args){
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

    // Write a method that joins the two lists by matching one girl with one boy into a new list
    // Exepected output: "Eve", "Joe", "Ashley", "Fred"...
    //System.out.println(girls.size());
    System.out.println(makingMatches(girls, boys));
  }

  private static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys) {
    ArrayList<String> girlsAndBoys = new ArrayList<String>();
    for (int i = 0; i < girls.size() && i < boys.size(); i++) {
      girlsAndBoys.add(girls.get(i));
      girlsAndBoys.add(boys.get(i));
    }
    for (int i = girlsAndBoys.size() / 2; i < boys.size(); i++) {
      girlsAndBoys.add(boys.get(i));
    }

    return girlsAndBoys;
  }
}

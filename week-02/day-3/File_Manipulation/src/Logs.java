import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.
    int IPsize = 0;
    unique("log.txt");
    for (int i= 0; i < (unique("log.txt")).size(); i++) {
      System.out.println((unique("log.txt").get(i)));
      IPsize ++;
    }
    System.out.println(IPsize);

  }

  public static List<String> unique(String file) {
    List<String> uniqueLines = new ArrayList<>();
    try {
      Path filepath = Paths.get(file);
      List<String> lines = Files.readAllLines(filepath);
      String[] splitted = new String[8];
      List<String> IPAdresses = new ArrayList<>();
      for (int i = 0; i < lines.size(); i++) {
        splitted =(lines.get(i).split("   "));
        IPAdresses.add(splitted[1]);
      }
      boolean temp = true;
      uniqueLines.add(IPAdresses.get(0));
      for (int i = 1; i < IPAdresses.size(); i++) {
        for (int j = 0; j < uniqueLines.size(); j++) {
          if (IPAdresses.get(i).equals(uniqueLines.get(j))) {
            temp = false;
          }
          }
          if (temp) {
            uniqueLines.add(IPAdresses.get(i));
        }
        temp = true;
      }
    } catch (Exception e) {
      System.out.println("I can't find the file!");
    }
    return uniqueLines;
  }

}

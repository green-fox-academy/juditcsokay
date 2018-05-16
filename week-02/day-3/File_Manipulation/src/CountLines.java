import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.

    System.out.println(numberOfLines("secondfile"));
  }

  public static int numberOfLines(String filename) {
    int numberoflines = 0;
    try {
      Path filepath = Paths.get(".\\secondfile.txt");
      List<String> lines = Files.readAllLines(filepath);
      for (String temp : lines) {
        numberoflines++;
      }
    } catch (IOException e) {
      System.out.println("Can't read the file!");
    } catch (Exception e) {
      System.out.println("Still can't read the file!");
    }
    return numberoflines;
  }

}

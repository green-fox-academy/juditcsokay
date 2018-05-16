import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // open and read it. The file data represents a tic-tac-toe
    // game result. Return 'X'/'O'/'draw' based on which player
    // has winning situation.

    ticTacResult("win-o.txt");
    // should print O

    ticTacResult("win-x.txt");
    // should print X

    ticTacResult("draw.txt");
    // should print draw
  }

  public static void ticTacResult(String filename) {
    String o = "o";
    String x = "x";
    try {
      Path filePath = Paths.get(".\\" + filename);
      List<String> lines = Files.readAllLines(filePath);
      for (int i = 0; i < lines.size(); i++) {
        if (lines.get(i).equals(o)) {
          System.out.println("O");
        } else if (lines.get(i).equals(x)) {
          System.out.println("X");
        } else {
          System.out.println("draw");
        }
      }
    } catch (Exception e) {
      System.out.println("I can't read the file!");
    }

  }
}

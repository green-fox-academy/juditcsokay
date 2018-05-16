import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

public class CopyFile {
  public static void main(String[] args) {
    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful

    System.out.println(copyFile("thirdfile.txt", "fourthfile.txt"));
  }

  private static boolean copyFile(String firstFile, String secondFile) {
    List<String> lines = null;
    List<String> moreLines = null;
    try {
      Path firstFilePath = Paths.get(".\\" + firstFile);
      Path secondFilePath = Paths.get(".\\" + secondFile);
      lines = Files.readAllLines(firstFilePath);
      moreLines = new ArrayList<>();
      for (int i = 0; i < lines.size(); i++) {
        //System.out.println(lines.get(i));
        String content = lines.get(i);
        moreLines.add(content);
      }
      for (int i = 0; i < moreLines.size(); i++) {
        Files.write(firstFilePath, moreLines);
        //System.out.println(moreLines.get(i));
      }
    } catch (Exception e) {
      System.out.println("Cannot find the file!");
    }
    return (moreLines.equals(lines));
  }
}

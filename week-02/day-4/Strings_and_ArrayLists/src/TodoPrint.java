public class TodoPrint {
  public static void main(String... args){
    String todoText = " - Buy milk\n";
    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention

    // Expected outpt:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo

    String[] toDoList = todoText.split(" ");
    String newList = "";
    newList += "My todo:\n";

    for (int i = 0; i < toDoList.length; i++) {
      //System.out.println(newList);
      newList = newList.concat(" " + toDoList[i]);
    }
    newList += "  - Download games\n";
    newList += "      - Diablo";
    System.out.println(newList);
    //System.out.println(todoText);
  }
}

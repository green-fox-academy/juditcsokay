import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {

  public static void main(String[] args) {

    Fox armand = new Fox("Armand", "green", "Pallida");
    Fox arnold = new Fox("Arnold", "green", "Pallida");
    Fox olga = new Fox("Olga", "orange", "Macrotis");
    Fox viola = new Fox("Viola", "purple", "Macrotis");
    Fox xavér = new Fox("Xavér", "green", "Fulvipes");
    Fox bulcsú = new Fox("Bulcsú", "green", "Fulvipes");

    ArrayList<Fox> foxes = new ArrayList<>();
    foxes.add(armand);
    foxes.add(arnold);
    foxes.add(olga);
    foxes.add(viola);
    foxes.add(xavér);
    foxes.add(bulcsú);

    System.out.println("The green foxes:");
    System.out.println(getGreenFoxes(foxes));

    System.out.println("The Pallida foxes:");
    System.out.println(getPallidaFoxes(foxes) + "\n");

    System.out.println("Another way");
    System.out.println("The green foxes:");
    System.out.println(getGreensAnotherWay(foxes));

    System.out.println("The Pallida foxes:");
    System.out.println(getPallidasAnotherWay(foxes));

  }

  public static Map<Boolean, List<Fox>> getGreenFoxes(ArrayList<Fox> foxes) {
    return foxes.stream()
            .collect(Collectors.groupingBy((Fox f) -> f.getColor().equals("green")));
  }

  public static Map<Boolean, List<Fox>> getPallidaFoxes(ArrayList<Fox> foxes) {
    return foxes.stream()
            .collect(Collectors.groupingBy((Fox f) -> f.getType().equals("Pallida")));

  }

  public static List<Fox> getGreensAnotherWay(ArrayList<Fox> foxes) {
    return foxes.stream()
            .filter(f -> f.getColor().equals("green"))
            .collect(Collectors.toList());
  }

  public static List<Fox> getPallidasAnotherWay(ArrayList<Fox> foxes) {
    return foxes.stream()
            .filter(f -> f.getType().equals("Pallida"))
            .collect(Collectors.toList());
  }



}

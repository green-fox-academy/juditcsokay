import java.util.ArrayList;
import java.util.List;

public class Garden {

  private List<Plant> plants;
  private int waterAmount = 0;

  public Garden(){
    plants = new ArrayList<>();
  }

  public void addPlant(Plant plant){
    plants.add(plant);
  }

  public int numberOfThirstys(){
    int thirstyPlants = 0;
    for (Plant plantie : plants) {
      if (plantie.getNeedsWater()) {
        thirstyPlants++;
      }
    }
    return thirstyPlants;
  }

  public void watering(int waterAmount) {
    System.out.println("Watering with " + waterAmount + ".");
    if (numberOfThirstys() != 0) {
      waterAmount = waterAmount / numberOfThirstys();
      for (Plant plantie : plants) {
        if (plantie.getNeedsWater()) {
          plantie.drink(waterAmount);
        }
      }
    }
  }

  public void isThirsty() {
    for (Plant plantie : plants) {
      plantie.needsWater(plantie.getCurrentWaterAmount(), plantie);
    }
  }
}

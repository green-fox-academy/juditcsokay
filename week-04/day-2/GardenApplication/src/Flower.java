public class Flower extends Plant {

  public Flower(String color){
    super(color);
  }

  public Flower(String color, double currentWaterAmount){
    super(color,currentWaterAmount);
  }

  @Override
  public void needsWater(double currentWaterAmount, Plant plant){
    if(currentWaterAmount < 5.0){
      setNeedsWater(true);
      System.out.println("The " + plant.getColor() + " flower needs water.");
    } else {
      setNeedsWater(false);
      System.out.println("The " + plant.getColor() + " flower doesen't need water.");
    }
  }

  @Override
  public void drink(int waterAmount){
    setCurrentWaterAmount(getCurrentWaterAmount() + waterAmount*0.75);
  }
}
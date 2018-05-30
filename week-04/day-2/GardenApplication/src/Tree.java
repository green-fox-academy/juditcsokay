public class Tree extends Plant{

  public Tree(String color){
    super(color);
  }

  public Tree(String color, double currentWaterAmount){
    super(color,currentWaterAmount);
  }

  @Override
  public void needsWater(double currentWaterAmount, Plant plant){
    if(currentWaterAmount < 10.0){
      setNeedsWater(true);
      System.out.println("The " + plant.getColor() + " tree needs water.");
    }else {
      setNeedsWater(false);
      System.out.println("The " + plant.getColor() + " tree doesen't need water.");
    }
  }

  @Override
  public void drink(int waterAmount){
    setCurrentWaterAmount(getCurrentWaterAmount() + waterAmount*0.4);
  }

}

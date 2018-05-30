public class Plant {

  private String color;
  private double currentWaterAmount;
  private boolean needsWater;

  public Plant(String color){
    this.color = color;
  }

  public Plant(String color, double currentWaterAmount) {
    this.color = color;
    this.currentWaterAmount = currentWaterAmount;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getCurrentWaterAmount() {
    return currentWaterAmount;
  }

  public boolean getNeedsWater() {
    return needsWater;
  }

  public void setNeedsWater(boolean needsWater) {
    this.needsWater = needsWater;
  }

  public void setCurrentWaterAmount(double currentWaterAmount) {
    this.currentWaterAmount = currentWaterAmount;
  }

  public void needsWater(double currentWaterAmount, Plant plant){}
  public void drink(int waterAmount){}
}

public class App {
  public static void main(String[] args) {
    Garden garden = new Garden();

    Flower yellowFlower = new Flower("yellow", 2.0);
    garden.addPlant(yellowFlower);

    Flower blueFlower = new Flower("blue", 4.5);
    garden.addPlant(blueFlower);

    Tree purpleTree = new Tree("purple", 8.1);
    garden.addPlant(purpleTree);

    Tree orangeTree = new Tree("orange", 6.3);
    garden.addPlant(orangeTree);

    garden.isThirsty();
    garden.numberOfThirstys();

    garden.watering(40);
    garden.isThirsty();

    garden.numberOfThirstys();

    garden.watering(70);
    garden.isThirsty();
  }
}

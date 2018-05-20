import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.

    checkerBoardDrawer(8, graphics);
  }

  public static void checkerBoardDrawer(int numberOfFields, Graphics graphics) {
    int xCoordinate = 0;
    int yCoordinate = 0;
    int size = WIDTH / numberOfFields;

    for (int i = 0; i < numberOfFields; i++) {
      for (int j = 0; j < numberOfFields; j++) {
        if (i % 2 == j % 2) {
          graphics.setColor(Color.WHITE);
          graphics.fillRect(xCoordinate,yCoordinate,size,size);
          xCoordinate += size;
        } else {
          graphics.setColor(Color.BLACK);
          graphics.fillRect(xCoordinate,yCoordinate,size,size);
          xCoordinate += size;
        }
      }
      xCoordinate = 0;
      yCoordinate += size;
    }
  }

  // Don't touch the code below
  static int WIDTH = 500;
  static int HEIGHT = 500;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT - 23));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.
    int xCoordinate = 0;
    int yCoordinate = 0;
    for (int i = 0; i < 16; i++) {
      for (int j = 0; j < 16; j++) {
        if (i % 2 == 0 && j % 2 == 0 || i % 2 != 0 && j % 2 != 0) {
          //graphics.drawRect(xCoordinate,yCoordinate,20,20);
          graphics.setColor(Color.WHITE);
          graphics.fillRect(xCoordinate,yCoordinate,20,20);
          xCoordinate += 20;
        } else {
          //graphics.drawRect(xCoordinate,yCoordinate,20,20);
          graphics.setColor(Color.BLACK);
          graphics.fillRect(xCoordinate,yCoordinate,20,20);
          xCoordinate += 20;
        }
      }
      xCoordinate = 0;
      yCoordinate += 20;
    }


  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
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
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // Fill the canvas with lines from the edges, every 20 px, to the center.

    linesToCenter(0,0,graphics);
  }

  private static void linesToCenter(int xCoordinate, int yCoordinate, Graphics graphics) {
    int center = WIDTH / 2;
    while (xCoordinate != WIDTH && yCoordinate == 0) {
        graphics.drawLine(xCoordinate, yCoordinate, center, center);
        xCoordinate += 20;
      }
      while (xCoordinate == WIDTH && yCoordinate != HEIGHT) {
        graphics.drawLine(xCoordinate, yCoordinate, center, center);
        yCoordinate += 20;
      }
      while (xCoordinate != 0 && yCoordinate == HEIGHT) {
        graphics.drawLine(xCoordinate, yCoordinate, center, center);
        xCoordinate -= 20;
      }
      while (xCoordinate == 0 && yCoordinate != 0) {
        graphics.drawLine(xCoordinate, yCoordinate, center, center);
        yCoordinate -= 20;
      }
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT-23));
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

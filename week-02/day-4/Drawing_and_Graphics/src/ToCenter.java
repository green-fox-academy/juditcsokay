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
      while (xCoordinate != 320 && yCoordinate == 0) {
        graphics.drawLine(xCoordinate, yCoordinate, 160, 160);
        xCoordinate += 20;
      }
      while (xCoordinate == 320 && yCoordinate != 320) {
        graphics.drawLine(xCoordinate, yCoordinate, 160, 160);
        yCoordinate += 20;
      }
      while (xCoordinate != 0 && yCoordinate == 320) {
        graphics.drawLine(xCoordinate, yCoordinate, 160, 160);
        xCoordinate -= 20;
      }
      while (xCoordinate == 0 && yCoordinate != 0) {
        graphics.drawLine(xCoordinate, yCoordinate, 160, 160);
        yCoordinate -= 20;
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

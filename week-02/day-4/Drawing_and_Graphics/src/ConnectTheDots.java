import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
  public static void mainDraw(Graphics graphics) {
    // Create a function that takes 1 parameter:
    // An array of {x, y} points
    // and connects them with green lines.
    // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
    // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
    // {120, 100}, {85, 130}, {50, 100}}

    int[][] boxDots = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
    int[][] anotherDots = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
            {120, 100}, {85, 130}, {50, 100}};
    dotConnecter(boxDots, graphics);
  }

  private static void dotConnecter(int[][] Dots, Graphics graphics) {
    ArrayList<Integer> xCoordinates = new ArrayList<>();
    ArrayList<Integer> yCoordinates = new ArrayList<>();
    xCoordinates.add(Dots[0][0]);
    yCoordinates.add(Dots[0][1]);
    //System.out.println(Dots.length);
    for (int i = 1; i < Dots.length; i++) {
      for (int j = 0; j <= 1; j++) {
        if(j != 1) {
          xCoordinates.add(Dots[i][j]);
        } else {
          yCoordinates.add(Dots[i][j]);
          System.out.println(yCoordinates.get(i));
        }
      }
      graphics.drawLine(xCoordinates.get(i-1),yCoordinates.get(i-1), xCoordinates.get(i), yCoordinates.get(i));
      if (i == Dots.length-1) {
        graphics.drawLine(xCoordinates.get(i),yCoordinates.get(i), xCoordinates.get(0), yCoordinates.get(0));
      }
    }

  }

  // Don't touch the code below
  static int WIDTH = 300;
  static int HEIGHT = 300;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT + 23));
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

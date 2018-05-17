import javax.swing.*;

import java.awt.*;

import static java.awt.Color.RED;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LineInTheMiddle {
  public static void mainDraw(Graphics graphics){
    // draw a red horizontal line to the canvas' middle.
    // draw a green vertical line to the canvas' middle.
    graphics.setColor(Color.RED);
    graphics.drawLine(80, 80, 180, 80);
    graphics.setColor(new Color(40,224,61));
    graphics.drawLine(140, 140, 140, 200);
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
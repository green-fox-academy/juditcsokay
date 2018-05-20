import com.sun.webkit.graphics.WCImageFrame;

import javax.swing.*;

import java.awt.*;
import java.sql.SQLClientInfoException;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxes {
  public static void mainDraw(Graphics graphics) {
    // Create a square drawing function that takes 2 parameters:
    // The square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares.

    squareDrawer(80, new Color((int) (Math.random() * 256), (int) (Math.random() * 256),
            (int) (Math.random() * 256)), graphics);

  }

  public static void squareDrawer(int squareSize, Color fillColor, Graphics graphics) {
    int loopSize = WIDTH / squareSize;
    int tempSquareSize = WIDTH;
    for (int i = 0; i < loopSize; i++) {
      graphics.setColor(fillColor);
      graphics.fillRect((WIDTH / 2) - (tempSquareSize / 2), (HEIGHT / 2) - (tempSquareSize / 2) ,tempSquareSize,tempSquareSize);
      tempSquareSize = tempSquareSize - squareSize;
      fillColor = new Color((int) (Math.random() * 256), (int) (Math.random() * 256),
              (int) (Math.random() * 256));
    }
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT -23));
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

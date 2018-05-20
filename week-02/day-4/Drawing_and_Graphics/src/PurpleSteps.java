import javax.swing.*;

import java.awt.*;

import static java.lang.StrictMath.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
  public static void mainDraw(Graphics graphics) {
    // Reproduce this:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]

    purpleSquareDiagonal(10, new Color(182,66,244), Color.BLACK, graphics);
  }

  public static void purpleSquareDiagonal(int squareSize, Color fillColor, Color drawColor, Graphics graphics) {
    double diagonal= WIDTH*WIDTH + HEIGHT*HEIGHT;
    diagonal = sqrt(diagonal);
    double squareSizeDiagonal = (squareSize*squareSize)*2;
    squareSizeDiagonal = sqrt(squareSizeDiagonal);
    int loopSize = (int) diagonal / (int) squareSizeDiagonal;
    int x= squareSize;
    int y = squareSize;
    for (int i = 0; i < loopSize-2; i++) {
      graphics.setColor(drawColor);
      graphics.drawRect(x, y,squareSize,squareSize);
      graphics.setColor(fillColor);
      graphics.fillRect(x+1, y+1,squareSize-1,squareSize-1);
      x += squareSize;
      y += squareSize;
    }
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

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

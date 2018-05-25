import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

public class YellowSquares {

  public static void mainDraw(Graphics graphics){
    graphics.setColor(new Color(244,66,66));
    graphics.fillRect(0,0,WIDTH,HEIGHT);
    graphics.setColor(new Color(247, 197, 57));

    getSquares(0,0,WIDTH, graphics);
  }

  public static void getSquares(int x, int y, int size, Graphics graphics) {
    graphics.drawRect(x + size/3, y, size / 3, size / 3);
    graphics.drawRect(x, y + size / 3, size / 3, size / 3);
    graphics.drawRect(x + size / 3, y + size / 3 * 2, size / 3, size / 3);
    graphics.drawRect(x + size / 3 * 2, y + size / 3, size / 3, size / 3);
    if (size > 5) {
      getSquares(x + size / 3, y, size / 3, graphics);
      getSquares(x, y + size/3, size / 3, graphics);
      getSquares(x + size / 3, y + size / 3 *2, size / 3, graphics);
      getSquares(x + size / 3 *2, y+ size / 3, size / 3, graphics);
    }
  }


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
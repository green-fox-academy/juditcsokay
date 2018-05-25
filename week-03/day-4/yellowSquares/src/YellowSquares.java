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

   /* int tempWidth = WIDTH;
    int tempHeight = HEIGHT;
    int x = tempWidth / 3;
    int y = tempHeight / 3;

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 4; j++) {
        graphics.setColor(new Color(247, 197, 57));
        graphics.drawRect(x,0, tempWidth / 3, tempHeight / 3);
        graphics.drawRect(0, y, tempWidth / 3, tempHeight / 3);
        graphics.drawRect(x, y * 2, tempWidth / 3, tempHeight / 3);
        graphics.drawRect(x * 2, y, tempWidth / 3, tempHeight / 3);
      }
      tempWidth = tempWidth/3;
      tempHeight = tempHeight/3;
      x -= tempWidth;
      y -= tempHeight;
    }*/
  }

  public static void getSquares(int x, int y, int size, Graphics graphics) {
    graphics.drawRect(x, y, size, size);
    if (size < 5) {
      graphics.drawRect(size,y, size / 3, size / 3);
      graphics.drawRect(x, size, size / 3, size / 3);
      graphics.drawRect(x, size * 2, size / 3, size / 3);
      graphics.drawRect(size * 2, y, size / 3, size / 3);
    } else {
      graphics.drawRect(size,y, size / 3, size / 3);
      graphics.drawRect(x, size, size / 3, size / 3);
      graphics.drawRect(x, size * 2, size / 3, size / 3);
      graphics.drawRect(size * 2, y, size / 3, size / 3);
      getSquares(x,y,size,graphics);
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
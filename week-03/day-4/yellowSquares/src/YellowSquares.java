import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

public class YellowSquares {

  public static void mainDraw(Graphics graphics){
    graphics.setColor(new Color(244,66,66));
    graphics.fillRect(0,0,WIDTH,HEIGHT);

    int tempWidth = WIDTH;
    int tempHeight = HEIGHT;

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 4; j++) {
        graphics.setColor(new Color(247, 197, 57));
        graphics.drawRect(tempWidth / 3, 0, tempWidth / 3, tempHeight / 3);
        graphics.drawRect(0, tempHeight / 3, tempWidth / 3, tempHeight / 3);
        graphics.drawRect(tempWidth / 3, tempHeight / 3 * 2, tempWidth / 3, tempHeight / 3);
        graphics.drawRect(tempWidth / 3 * 2, tempHeight / 3, tempWidth / 3, tempHeight / 3);
      }
      tempWidth = tempWidth + tempWidth/3;
      tempHeight = tempHeight + tempHeight/3;
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
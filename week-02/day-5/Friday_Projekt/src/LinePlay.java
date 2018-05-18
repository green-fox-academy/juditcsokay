import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {

    linePlay(20,0,graphics);
    

  }

  public static void linePlay(int xCoordinate, int yCoordinate, Graphics graphics) {
    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    for (int i = 0; i < 15; i++) {
      graphics.setColor(new Color(187,130,239));
      graphics.drawLine(xCoordinate,yCoordinate,320,xCoordinate);
        xCoordinate += 20;
    }
    xCoordinate = 0;
    for (int i = 0; i < 15; i++) {
      graphics.setColor(new Color(103,239,132));
      graphics.drawLine(yCoordinate,xCoordinate,xCoordinate,320);
      xCoordinate += 20;
    }
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

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

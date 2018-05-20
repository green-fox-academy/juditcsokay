import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {

    linePlay(WIDTH,HEIGHT,graphics);
  }

  public static void linePlay(int width, int height, Graphics graphics) {
    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    //felső
    int xCoordinate = 0;
    int yCoordinate = 20;
    for (int i = 0; i < width / 20; i++) {
      graphics.setColor(new Color(187,130,239));
      graphics.drawLine(xCoordinate,0,width,yCoordinate);
        xCoordinate += 20;
        yCoordinate += 20;
    }
    xCoordinate = 20;
    yCoordinate = 0;
    //alsó
    for (int i = 0; i < width / 20; i++) {
      graphics.setColor(new Color(103,239,132));
      graphics.drawLine(0,yCoordinate,xCoordinate,height);
      xCoordinate += 20;
      yCoordinate += 20;
    }
  }

  // Don't touch the code below
  static int WIDTH = 800;
  static int HEIGHT = 800;

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

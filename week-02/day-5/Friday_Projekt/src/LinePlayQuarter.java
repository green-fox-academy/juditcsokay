import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarter {
  public static void mainDraw(Graphics graphics) {

    linePlay(140,0,graphics);
  }

  public static void linePlay(int xCoordinate, int yCoordinate, Graphics graphics) {
    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    int tempCoordinate = 20;
    //jobb felső
    for (int i = 0; i < 9; i++) {
      graphics.setColor(new Color(255,127,53));
      graphics.drawLine(xCoordinate,yCoordinate,320,tempCoordinate);
      xCoordinate += 20;
      tempCoordinate += 20;
    }
    //bal felső
    xCoordinate = 0;
    yCoordinate = 140;
    tempCoordinate = 20;
    for (int i = 0; i < 9; i++) {
      graphics.setColor(new Color(103,239,132));
      graphics.drawLine(xCoordinate,yCoordinate,tempCoordinate,0);
      yCoordinate -= 20;
      tempCoordinate += 20;
    }
    //bal alsó
    yCoordinate= 140;
    tempCoordinate = 20;
    for (int i = 0; i < 9; i++) {
      graphics.setColor(new Color(239,103,112));
      graphics.drawLine(0,yCoordinate,tempCoordinate,320);
      yCoordinate += 20;
      tempCoordinate += 20;
    }
    //jobb alsó
    yCoordinate= 140;
    tempCoordinate = 300;
    for (int i = 0; i < 9; i++) {
      graphics.setColor(new Color(187,130,239));
      graphics.drawLine(320,yCoordinate,tempCoordinate,320);
      yCoordinate += 20;
      tempCoordinate -= 20;
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

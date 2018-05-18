import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
  public static void mainDraw(Graphics graphics) {

    linePlay(WIDTH,HEIGHT,graphics);
  }

  public static void linePlay(int width, int height, Graphics graphics) {
    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    int fixCoordinate = (width / 20) *10;  //160

    //bal felső
    int xCoordinate = (width / 20) * 10; //160
    int yCoordinate = 0;
    for (int i = 0; i <= (width/20) / 2; i++) {
      graphics.setColor(new Color(103,239,132));
      graphics.drawLine(xCoordinate,fixCoordinate,fixCoordinate,yCoordinate);
      xCoordinate -= 20;
      yCoordinate += 20;
    }

    //jobb felső
    xCoordinate = (width / 20) * 10; //160
    yCoordinate = 0;
    for (int i = 0; i <= (width/20) / 2; i++) {
      graphics.setColor(new Color(103,239,132));
      graphics.drawLine(xCoordinate,fixCoordinate,fixCoordinate,yCoordinate);
      xCoordinate += 20;
      yCoordinate += 20;
    }
    //jobb alsó
    xCoordinate = (width / 20) * 10; //160
    yCoordinate = width;
    for (int i = 0; i <= (width/20) / 2; i++) {
      graphics.setColor(new Color(103,239,132));
      graphics.drawLine(xCoordinate,fixCoordinate,fixCoordinate,yCoordinate);
      xCoordinate += 20;
      yCoordinate -= 20;
    }
    //bal alsó
    xCoordinate = (width / 20) * 10; //160
    yCoordinate = width;
    for (int i = 0; i <= (width/20) / 2; i++) {
      graphics.setColor(new Color(103,239,132));
      graphics.drawLine(xCoordinate,fixCoordinate,fixCoordinate,yCoordinate);
      xCoordinate -= 20;
      yCoordinate -= 20;
    }
  }

  // Don't touch the code below
  static int WIDTH =  500;
  static int HEIGHT = 500;

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

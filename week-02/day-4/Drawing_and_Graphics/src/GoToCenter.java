import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // Draw 3 lines with that function. Use loop for that.
    //graphics.setColor(Color.RED);
    //graphics.fillRect(0, 0, WIDTH, HEIGHT);

    lineDrawer(80,150, graphics);

    }
  private static void lineDrawer(int x, int y, Graphics graphics) {
    //graphics.setColor(Color.YELLOW);
    for (int i = 0; i < 3; i++) {
      graphics.drawLine(x,y,160,160);
      x += 50;
      y += 50;
    }


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

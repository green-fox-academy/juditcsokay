import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredBoxes {

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 1 parameter:
    // the square size
    // and draws a square of that size to the center of the canvas.
    // draw 3 squares with that function.
    // avoid code duplication.

    squareDrawer(30, graphics);

  }

  private static void squareDrawer(int size, Graphics graphics) {
    //graphics.setColor(Color.RED);
    //graphics.fillRect(0, 0, WIDTH, HEIGHT);
    for (int i = 0; i < 3; i++) {
      //graphics.setColor(Color.YELLOW);
      int x = (WIDTH / 2) - ((size) / 2);
      int y = (HEIGHT / 2) - ((size) / 2);
      graphics.drawRect(x,y,size,size);
      size += 30;
    }
  }

  //    Don't touch the code below
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
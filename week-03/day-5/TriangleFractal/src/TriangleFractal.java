import javax.swing.*;
import javax.swing.tree.FixedHeightLayoutCache;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TriangleFractal {

  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.WHITE);
    graphics.fillRect(0,0,WIDTH,HEIGHT);

    bigTrianlge(graphics);
    recursiveTriangles(0,0, WIDTH, HEIGHT, graphics);

  }

  public static void bigTrianlge(Graphics graphics) {
      graphics.setColor(new Color(107,42,137));
      graphics.drawLine(0, 0, WIDTH, 0);
      graphics.drawLine(WIDTH, 0, WIDTH/2, HEIGHT);
      graphics.drawLine(WIDTH/2, HEIGHT, 0, 0);
  }

  public static void recursiveTriangles(int x, int y, int width, int height, /*int size*/ Graphics graphics) {
    graphics.drawLine(x + width / 2, y, x + 3 * (width / 4), y + height / 2);
    graphics.drawLine(x + 3 * width / 4, y + height / 2, x + width / 4, y + height / 2);
    graphics.drawLine(x + width / 4, y + height / 2, x + width / 2, y);

    if (width > 20) {
      recursiveTriangles(x, y, (int)(width/2+0.5), (int)(height/2+0.5), graphics);
      recursiveTriangles(x + width/2, y, width/2+1, height/2+1, graphics);
      recursiveTriangles(x + width/4, y + height/2, width/2+1, height/2+1, graphics);
    }
  }


// Don't touch the code below
  static int WIDTH = 1000;
  static int HEIGHT = (int)Math.sqrt((WIDTH*WIDTH)-((WIDTH/2)*(WIDTH/2)));

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT - 23));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    System.out.println(HEIGHT);

  }
static class ImagePanel extends JPanel {
  @Override
  protected void paintComponent(Graphics graphics) {
    super.paintComponent(graphics);
    mainDraw(graphics);
  }
}
}

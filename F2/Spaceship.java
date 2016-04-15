package F2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

class Spaceship extends JComponent {

  public void paint(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    Rectangle2D df =new Rectangle2D.Double(175,540, 30,40);
    
    g2.fill(df);
  }
}
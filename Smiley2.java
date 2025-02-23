import java.applet.*;
import java.awt.*;
public class Smiley2 extends Applet
{
  public void paint(Graphics g)
  {
    g.setColor(Color.yellow);
    g.fillOval(80, 80, 160, 180);
    g.setColor(Color.black);
    g.fillOval(118, 130, 17, 17);
    g.fillOval(187, 130, 17, 17);
    g.setColor(Color.red);
    int x[]={160,145,175};
    int y[]={160,190,190};
    g.drawPolygon(x,y,3);
    g.setColor(Color.black);
    g.drawArc(120, 180, 80, 50, 180,180);
  }
}
/* <applet code="Smiley2.class" width="300" height="300">
</applet> */

import java.awt.*;
import javax.swing.text.html.StyleSheet;
import java.applet.*;
public class Rectangle1 extends Applet
{
  String a,b,c,d,e;
  Color color;
  int x1,y1,x2,y2;
  StyleSheet s=new StyleSheet();
  public void init()
  {
    a = getParameter("x1");
    b= getParameter("y1");
    c = getParameter("x2");
    d = getParameter("y2");
    e = getParameter("color");
    x1 = Integer.parseInt(a);
    y1 = Integer.parseInt(b);
    x2 = Integer.parseInt(c);
    y2 = Integer.parseInt(d);
    color = s.stringToColor(e);
  }
  public void paint(Graphics g)
  {
    g.setColor(color);
    g.drawRect(x1,y1,x2,y2);
  }
}

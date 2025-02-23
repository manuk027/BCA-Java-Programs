import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Box extends Applet implements ActionListener
{
  List list;
  Button b;
  public void init()
  {
    list=new List(5,true);
    b=new Button("REMOVE");
    list.add("one");
    list.add("two");
    list.add("three");
    list.add("four");
    list.add("five");
    list.add("six");
    add(list);
    add(b);
    b.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e)
  {
    list.remove(list.getSelectedItem());
    repaint();
  }
}

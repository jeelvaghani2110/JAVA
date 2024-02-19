import java.awt.* ;
import java.awt.Graphics.* ; 

class Gui10 extends Frame
{
    Gui10()
    {
        super("Graphics");
        setSize(600,400);
        setVisible(true);
    }


    public void paint(Graphics g)
    {
        g.drawRect(250,150,100,100);
        g.setColor(Color.YELLOW);
        g.drawLine(250,200,350,200);
        g.setColor(Color.YELLOW);
        g.drawLine(300,150,300,250);
        g.setColor(Color.RED);
        g.drawOval(250,150,100,100);
    }
}

class main
{
    public static void main(String[] args)
    {
        Gui10 g1 = new Gui10();
    }
}
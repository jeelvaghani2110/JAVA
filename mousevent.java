import java.awt.*;
import java.awt.Graphics.*;
import java.awt.event.*;

class mousevent extends Frame implements MouseListener , MouseMotionListener 
{

    mousevent()
    {
        super("MOUSEEVENT PROGRAME");
        setSize(500,500);
        setVisible(true);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent e)
    {

    }
    public void mouseEntered(MouseEvent e)
    {
        setBackground(Color.RED);
    }
    public void mousePressed(MouseEvent e)
    {
        
    }
    public void mouseExited(MouseEvent e)
    {
        setBackground(Color.BLUE);
    }
    public void mouseReleased(MouseEvent e)
    {
        
    }

    public void mouseMove(MouseEvent e)
    {
        
    }
    public void mouseDragged(MouseEvent e)
    {
        
    }
}

class main
{
    public static void main(String[] args) 
    {
        mousevent m1 = new mousevent();
    }
}
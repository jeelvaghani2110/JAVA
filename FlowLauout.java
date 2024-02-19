import java.awt.*;
import java.awt.Graphics.*;

class main 
{

    public static void main(String args[])
    {
        FlowLauout f1 = new  FlowLauout() ;
    }    
}

class FlowLauout extends Frame
{
    public static GraphicsConfiguration CENTER;

    FlowLauout()
    {
        super("Layout");
        setSize(800,400);
        setVisible(true);
        
        setLayout(new FlowLayout());
        Button b1 = new Button("Left");
        add(b1);
        Button b2 = new Button("Center");
        add(b2);
        Button b3 = new Button("Right");
        add(b3);
    }
}
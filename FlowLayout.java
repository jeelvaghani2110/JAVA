import java.awt.*;
import java.awt.Graphics.* ;

class FlowLayout extends Frame
{
    FlowLayout()
    {
        super("FlowLayout Demo");
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

class main 
{
    public static void main(String args[])
    {
        FlowLayout f1 = new FlowLayout() ;
    }    
}
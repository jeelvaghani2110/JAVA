import java.awt.*;
import java.awt.Graphics.*;

class Paintmethod extends Frame
{
    Paintmethod()
    {
        super("title name");
        setSize(600,400);
		setBackground(Color.GREEN);
		setVisible(true);	
    }

    public void paint(Graphics g)
    {
        //g.setColor(Color.RED);   //string rect(aakha rect ma j red color thay jay) badhu red thay jashe.
        g.drawString("JEEL VAGHANI", 50 , 50);
        //g.setColor(Color.RED);
        // g.drawRect(315, 185, 70, 30);
        // g.drawOval(250, 100, 200, 200);  //circle
        // g.drawOval(250, 100, 100, 200);  //vertical oval
        // g.drawOval(250, 100, 200, 100);  //horizontal oval

        g.drawRect(250, 150, 100, 100);  //g.fillRect();--->rect ne red color karva.
        g.drawOval(250, 150 , 100, 100);
        g.drawLine(300, 150, 300, 250);
        g.drawLine(250, 200, 350, 200);
    } 
}

class main
{
    public static void main(String args[])
    {
        Paintmethod p1 = new Paintmethod() ;  
    }
}
import java.awt.*;

class FrameExtend extends Frame
{
	FrameExtend()	
	{
		setName("jeel vaghani");	    //super("jeel vaghani");
		setSize(400,400);
		setBackground(Color.RED);
		setVisible(true);	
	}
}

class gui2
{
	public static void main(String args[])
	{
		FrameExtend f1 = new FrameExtend();
	}	
}
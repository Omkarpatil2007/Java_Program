import java.awt.*;
import java.awt.event.*;
class myButton extends Frame
{
	public myButton()
	{
			
		Button B1=new Button ("OK");
		B1.setBounds(100,50,50,50);
		add(B1);

		Button B2=new Button ("RESET");
		B2.setBounds(100,100,50,50);
		add(B2);
		
		Button B3=new Button ("CANCEL");
		B3.setBounds(100,150,50,50);
		add(B3);

		setTitle("Select");
		setVisible(true);
		setSize(400,400);
	}
	public static void main(String[]args)
	{
		myButton ob1=new myButton();
	}
}

		
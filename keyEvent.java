import java.awt.*;
import java.awt.event.*;

public class keyEvent extends Frame implements KeyListener
{
	Label L1;
	TextField TF;	

	public keyEvent()
	{
	L1=new Label("Enter the text");
	L1.setBounds(50,50,100,50);

	TF=new TextField();
	TF.setBounds(50,150,250,50);

	TF.addKeyListener(this);
	
	add(L1);
         	add(TF);
        	setSize(400, 250);
        	setLayout(null);
       	setVisible(true);
	}

	public void keyPressed(KeyEvent e)
	{
		L1.setText("Key Pressed:"+e.getKeyChar());
	}
	
	public void keyTyped(KeyEvent e)
	{
		L1.setText("Key Typed:"+e.getKeyChar());
	}
	
	public void keyReleased(KeyEvent e)
	{
		L1.setText("Key Released:"+e.getKeyChar());
	}

	public static void main(String[]args)
	{
		keyEvent  KE=new keyEvent();
	}
}



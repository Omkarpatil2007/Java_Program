import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Frame;
import java.awt.*;
class DemoButton extends Frame
{
	public DemoButton()
	{
		Font f = new Font("Arial",Font.BOLD,15);
		setLayout(new FlowLayout());
		Button btn1 = new Button();
		Button btn2 = new Button("click me");
		
		btn1.setBackground(Color.cyan);
		btn2.setBackground(Color.gray);
		btn2.setFont(f);

		add(btn1);
		add(btn2);

	}

	public static void main(String args[])
	{
		DemoButton fr = new DemoButton();

		fr.setSize(300,300);
		fr.setTitle("Demonstrak AWT Button");
		fr.setVisible(true);
	}
}
import java.awt.*;

class DemoButton1 extends Frame
{
	public DemoButton1()
	{

	Button B1=new Button("click me");
	B1.setBounds(150,150,100,50);
	add(B1);

	setLayout(null);
	setSize(400,440);
	setVisible(true);
	}

	public static void main(String[]args)
	{
		DemoButton1 DB=new DemoButton1();
	}
}
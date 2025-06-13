import java.awt.*;
class Democheckbox extends Frame
{
	public Democheckbox()
	{

		Checkbox C1=new Checkbox("Java");
		C1.setBounds(150,5


0,50,50);
		add(C1);

		Checkbox C2=new Checkbox ("Python");
		C2.setBounds(150,100,50,50);
		add(C2);

		setTitle("Select Language");
		setVisible(true);
		setSize(300,300);
	}
	public static void main(String[]args)
	{
		Democheckbox DC=new Democheckbox ();
	}
}
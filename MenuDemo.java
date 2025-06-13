import java.awt.*;
public class MenuDemo extends Frame
{
	public MenuDemo()
	{
		MenuBar MB=new MenuBar();
		setMenuBar(MB);

		Menu Color=new Menu("Colors");
		MB.add(Color);
		
		MenuItem M1=new MenuItem("Red");
		Color.add(M1);

		MenuItem M2=new MenuItem("Black");
		Color.add(M2);
		M2.setEnabled(false);

		MenuItem M3=new MenuItem("Blue");
		Color.add(M3);

		setTitle("MenuDemo");
		setVisible(true);
		setSize(400,400);
	}
	public static void main(String[]args)
	{
		MenuDemo MD=new MenuDemo();
	}
}
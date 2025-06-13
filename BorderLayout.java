import javax.swing.*;
import java.awt.*;

public class BorderLayout extends JFrame
{
	public BorderLayout()
	{
		setLayout(new BorderLayout(3,3));		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton NB=new JButton("North");
		add(NB,BorderLayout .NORTH);

		JButton WB=new JButton("West");
		add(WB,BorderLayout .WEST);

		JButton CB=new JButton("Center");
		add(CB,JBorderLayout .CENTER);

		JButton EB=new JButton("East");
		add(EB,BorderLayout .EAST);

		JButton SB=new JButton("South");
		add(SB,BorderLayout .SOUTH);
		
		setTitle("BorderLayout");
		setVisible(true);
		setSize(400,400);
	}
	public static void main(String[]args)
	{
		BorderLayout BL=new BorderLayout();
	}
}


import javax.swing.*;
import java.awt.*;

public class Grid5*5 extends JFrame
{
	public Grid5*5()
	{
		setLayout(new GridLayout(5,5));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Grid5*5");
		
		for(int i=1;i<=25;i++)
		{
			JButton B1=new JButton(String.valueOf(i));
			add(B1);
		}

		setVisible(true);
		setSize(400,400);
	}
	public static void main(String[]args)
	{
		Grid5*5 BL=new Grid5*5();
	}
}
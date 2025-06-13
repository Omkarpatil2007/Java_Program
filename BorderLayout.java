/*import javax.swing.*;*/
import java.awt.*;

public class BorderLayout extends JFrame
{
	public BorderLayout()
	{
		setLayout(new JBorderLayout(3,3));		

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("BorderLayout");
		setVisible(true);
		setSize(400,400);
	}
	public static void main(String[]args)
	{
		BorderLayout BL=new BorderLayout();
	}
}
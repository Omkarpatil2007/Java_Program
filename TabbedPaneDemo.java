import javax.swing.*;
public class TabbedPaneDemo
{
	public static void main(String[]args)
	{
		JFrame JF = new JFrame("Tabbed Pane");
		
		JTabbedPane TP=new JTabbedPane();

		JPanel P1= new JPanel();
		P1.add(new JLabel("AIML"));

		JPanel P2= new JPanel();
		P2.add(new JLabel("CO"));

		JPanel P3= new JPanel();
		P3.add(new JLabel("EE"));

		TP.addTab("TAB1",P1);
		TP.addTab("TAB2",P2);
		TP.addTab("TAB3",P3);

		JF.add(TP);
		JF.setSize(500,400);
		JF.setVisible(true);
	}
}
		
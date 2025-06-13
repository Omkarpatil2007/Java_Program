import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.*;
public class TreeNodeDemo
{
	public static void main(String[]args)
	{
		JFrame JF = new JFrame("Tree Node");
		
		DefaultMutableTreeNode TN1= new DefaultMutableTreeNode("GrandParent");
		DefaultMutableTreeNode TN2= new DefaultMutableTreeNode("Parent1");
		DefaultMutableTreeNode TN3= new DefaultMutableTreeNode("Parent2");
		DefaultMutableTreeNode TN4= new DefaultMutableTreeNode("Parent3");
		DefaultMutableTreeNode TN5= new DefaultMutableTreeNode("Child1");
		DefaultMutableTreeNode TN6= new DefaultMutableTreeNode("Child2");

		TN1.add(TN2);
		TN1.add(TN3);
		TN1.add(TN4);
		TN2.add(TN5);
		TN2.add(TN6);

		JTree JT= new JTree(TN1);
                                 JF.add(JT);
		JF.setSize(500,400);
              		JF.setVisible(true);
	}
	
}
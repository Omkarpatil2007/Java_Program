import javax.swing.*;
public class JFrameDemo
{
    JFrameDemo()
        {
            JFrame JF = new JFrame("Omkar");
             ImageIcon I1=new ImageIcon("C:\\Users\\Admin\\Downloads\\images.jfif");
	
             JLabel J1 = new JLabel("Nature",I1,JLabel.CENTER);
             J1.setBounds(50,50,50,20);
             JF.add(J1);

              JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

              JF.setSize(400,400);
              JF.setVisible(true);
         }
              public static void main(String args[])
              {
	JFrameDemo JD=new JFrameDemo();
              }
}	
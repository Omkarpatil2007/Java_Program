import java.awt.event.*;
import javax.swing.*;

public class ActionEventSwing extends JFrame implements ActionListener 
{
    JLabel L1, L2;
    JTextArea TA1, TA2;
    JButton B1;
    JScrollPane SP;

    public ActionEventSwing() 
{
        L1 = new JLabel("Name");
        L1.setBounds(50, 40, 100, 30);
        add(L1);

        TA1 = new JTextArea();
        TA1.setBounds(150, 40, 200, 30);
        add(TA1);

        L2 = new JLabel("Comments");
        L2.setBounds(50, 80, 100, 30);
        add(L2);

        TA2 = new JTextArea();
        TA2.setBounds(150, 80, 200, 50);
        SP = new JScrollPane();
        TA2.add(SP);
        add(TA2);

        B1 = new JButton("Submit");
        B1.setBounds(150, 130, 100, 40);
        add(B1);

        setSize(400, 250);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        B1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) 
{
        L1.setText("You entered: " + TA1.getText());
    }

    public static void main(String[] args) 
{
        new ActionEventSwing();
    }
}


		
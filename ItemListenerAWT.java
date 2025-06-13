import java.awt.*;
import java.awt.event.*;

public class ItemListenerAWT extends Frame implements ItemListener
 {
    private Checkbox C1;
    private Label L1;

    public ItemListenerAWT()
 {
        L1 = new Label("Check the box:");
        L1.setBounds(50, 50, 200, 30);

        C1 = new Checkbox("Accept Terms");
        C1.setBounds(50, 100, 150, 30);

        C1.addItemListener(this);

        add(L1);
        add(C1);
        setSize(400, 250);
        setLayout(null);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e)
   {
            if (C1.getState()) 
	{
                 L1.setText("Checkbox is Checked");
            }
	 else 
	{
                L1.setText("Checkbox is Unchecked");
            }
    }

    public static void main(String[] args) 
    {
        new ItemListenerAWT();
    }
}
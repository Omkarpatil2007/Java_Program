import java.awt.*;
import java.awt.event.*;

public class ActionListenerAWT extends Frame implements ActionListener 
{
    TextField textField;
    Button button;
    Label label;

    public ActionListenerAWT() 
   {
        label = new Label("Enter text and click the button:");
        label.setBounds(50, 50, 250, 30);

        textField = new TextField();
        textField.setBounds(50, 100, 200, 30);

        button = new Button("Submit");
        button.setBounds(50, 150, 50, 30);

        button.addActionListener(this);

        add(label);
        add(textField);
        add(button);
        setSize(400, 250);
        setLayout(null);
        setVisible(true);

    }

  
    public void actionPerformed(ActionEvent e) 
   {
        label.setText("You entered: " + textField.getText());
    }

    public static void main(String[] args) 
   {
        new ActionListenerAWT();
    }
}
import java.awt.*;
import java.awt.event.*;

class myButton1 extends Frame {
    public myButton1() {
        // Creating buttons
        Button B1 = new Button("OK");
        B1.setBounds(100, 50, 50, 50);
        add(B1);

        Button B2 = new Button("RESET");
        B2.setBounds(100, 100, 50, 50);
        add(B2);

        Button B3 = new Button("CANCEL");
        B3.setBounds(100, 150, 50, 50);
        add(B3);

        // Adding button listeners (optional)
        B1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("OK Button Clicked");
            }
        });

        B2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("RESET Button Clicked");
            }
        });

        B3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("CANCEL Button Clicked");
            }
        });

        // Set Frame properties
        setTitle("Select");
        setVisible(true);
        setSize(400, 400);
        
        // Handle window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);  // Closes the application
            }
        });
    }

    public static void main(String[] args) {
        myButton1 ob1 = new myButton1();
    }
}

import java.awt.*;
import java.awt.event.*;

public class MouseListenerAWT extends Frame implements MouseListener {
    private Label L1;

    public MouseListenerAWT() 
   {
        L1= new Label("Click for window");
        L1.setBounds(50, 50, 300, 30);

        addMouseListener(this);

        add(L1);
        setSize(400, 250);
        setLayout(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) 
   {
       L1.setText("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) 
    {
        L1.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) 
    {
        L1.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) 
    {
        L1.setText("MouseDragged");
    }

    public void mouseExited(MouseEvent e) 
    {
        L1.setText("MouseMoved");
    }

    public static void main(String[] args) 
    {
       MouseListenerAWT ML= new MouseListenerAWT();
    }
}
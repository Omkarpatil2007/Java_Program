import java.awt.*;

class CheckRadio extends Frame
{
	public CheckRadio()
	{
		Label L=new Label("Select Gender");
		L.setBounds(50,50,80,80);
		add(L);

		CheckboxGroup CG=new CheckboxGroup();

		Checkbox C1=new Checkbox("Male",true,CG);
		C1.setBounds(50,100,80,80);
		add(C1);

		Checkbox C2=new Checkbox("Female",false,CG);
		C2.setBounds(50,150,80,80);
		add(C2);

		Checkbox C3=new Checkbox("Other",false,CG);
		C3.setBounds(50,200,80,80);
		add(C3);
		
		Button B1=new Button("Submit");
		B1.setBounds(50,250,75,75);
		add(B1);
		
		setTitle("Select");
		setVisible(true);
		setSize(600,600);
	}
	public static void main(String[]args)
	{
		CheckRadio CR=new CheckRadio();
	}
}
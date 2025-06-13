import java.awt.*;
class mycheckbox extends Frame
{
	public mycheckbox()
	{
		CheckboxGroup CG=new CheckboxGroup();

		Checkbox C1=new Checkbox("Java",true,CG);
		C1.setBounds(100,100,50,50);
		add(C1);

		Checkbox C2=new Checkbox ("Python",false,CG);
		C2.setBounds(200,200,50,50);
		add(C2);

		setTitle("Select Language");
		setVisible(true);
		setSize(300,300);
	}
	public static void main(String[]args)
	{
		mycheckbox mc=new mycheckbox();
	}
}

		
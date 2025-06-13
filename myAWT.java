import java.awt.*;
class myAWT extends Frame
{
	public myAWT ()
	{
		TextField TF=new TextField("KPIT");
		TF.setBounds(100,100,50,50);
		add(TF);

		TextArea TA=new TextArea("Department of AIML");
		TA.setBounds(200,200,200,50);
		add(TA);

		Label L=new Label ("Subject");
		L.setBounds(300,300,50,50);
		add(L);
			
		Button B1=new Button ("JPR");
		B1.setBounds(400,400,50,50);
		add(B1);

		Button B2=new Button ("MML");
		B2.setBounds(500,500,50,50);
		add(B2);
		
		Button B3=new Button ("DCN");
		B3.setBounds(600,600,50,50);
		add(B3);

		setTitle("Clg Information");
		setVisible(true);
		setSize(800,800);
	}
	public static void main(String[]args)
	{
		myAWT ob1=new myAWT();
	}
}

		
import java.awt.*;
class Newspaper extends Frame
{
	public Newspaper()
	{
		
		List L1=new List(5);
		L1.add("Lokamat");
		L1.add("Pudhari");
		L1.add("Indian Express");
		L1.add("Dainik Bhaskar");
		L1.add("The Times of India");
		add(L1);

		setTitle("Select news paper");
		setVisible(true);
		setSize(400,500);
	}
	public static void main(String[]args)
	{
		Newspaper ob1=new Newspaper ();
	}
}

		
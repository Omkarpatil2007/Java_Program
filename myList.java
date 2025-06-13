import java.awt.*;
class myList extends Frame
{
	public myList()
	{
			
		List L1=new List(10);
		L1.add("Kolhapur");
		L1.add("Pune");
		L1.add("Mumbai");
		L1.add("Nagpur");
		L1.add("Delhi");
		L1.add("Chennai");
		L1.add("Kolkatta");
		L1.add("Rajsthan");
		L1.add("Surat");
		L1.add("Jaipur");
		add(L1);

		setTitle("Select");
		setVisible(true);
		setSize(400,500);
	}
	public static void main(String[]args)
	{
		myList ob1=new myList ();
	}
}

		
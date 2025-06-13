class Myexception extends Exception
{
	public Myexception (String m)
	{
		super(m);
	}
}
public class userdefine
{
	public static void main (String[]args)
	{
		try
		{
			throw new Myexception("custom");
		}
		catch(Myexception e)
		{
			System.out.println("Exeception");
		}
	}
}

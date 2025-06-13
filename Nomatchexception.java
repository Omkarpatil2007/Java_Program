
class NoMactchException extends Exception
{
	NoMactchException (String a)
	{
		super(a);
	}
}

class Nomatchexception
{
	public static void main(String []args)
	{
		String str1="India";
		String str2="abcd";
		try
		{
			if(!str1.equals(str2));
			{
				throw new Nomatchexception(" No match Exception");
			}
		}
		catch(Nomatchexception e)
		{
			System.out.println("done");
		}
	}
}	
		
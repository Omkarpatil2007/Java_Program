public class ExceptionHandlingSample
{
	public static void main(String args[])
	{
	int a=5,b=10,c;
	try
	{
	c=a/(b-10);
	}
	
	catch(ArithmeticException e)
	{
	System.out.println("ArithmeticException occured");
	}
	
	finally
	{
	System.out.println("Result:"+c);
	}
	}

}
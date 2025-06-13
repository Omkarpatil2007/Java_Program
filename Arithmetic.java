
class ArithmeticException extends Exception
{
	ArithmeticException(String a)
	{
		super(a);
	}
}
class Arithmetic
{
	public static void main(String []args)
	{
	int age=5;
	try
	{

	if (18<= age)
	{
		throw new ArithmeticException("You can Vote");
	}
	else
	{
		System.out.println("you can not Vote");
	}
	}
	catch(ArithmeticException e)
	{
		System.out.println("catch Exception:"+e.getMessage());
	}
	}
}




		
import java.util.*;
class AuthenticationFailure extends Exception
{
	AuthenticationFailure (String s)
	{
		super(s);
	}
}

class Authentication
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	String str="omkar";
	System.out.println("Enter the password:");
	String str1=sc.nextLine();

	try
	{
	if(!str1.equals(str))
	{
		throw new AuthenticationFailure("password is incorrect");
	}
	else
	{
		System.out.println("password is correct");
	}
	}
	catch(AuthenticationFailure e)
	{
		System.out.println("catch Exception:"+e.getMessage());
	}
	}
}
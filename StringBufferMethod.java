public class StringBufferMethod
{
	public static void main(String args[])
	{  
	StringBuffer sb = new StringBuffer("Welcome");
	
	System.out.println("After insert:"+sb.insert(0,"java "));

	System.out.println("After append:"+sb.append(" To"));

	System.out.println("After Replace:"+sb.replace(0 ,4,"Python"));

	System.out.println("After Delete:"+sb.delete(15,18));
	
	System.out.println("After reverse:"+sb.reverse());
	}
}
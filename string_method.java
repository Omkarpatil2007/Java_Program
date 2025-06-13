public class string_method
{
	public static void main(String args[])
	{
	String str1="Hello";
	String str2="Java";

	System.out.println("length of the string:"+str1.length());

	System.out.println("character at index o:"+str1.charAt(0));

	System.out.println("lowercase string:"+str2.toLowerCase());

	System.out.println("uppercase string:"+str2.toUpperCase());

	System.out.println("concatnation of two string:"+str1.concat(str2));

	System.out.println("two string are equal:"+str1.equals(str2));
	
	System.out.println("compare two string :"+str1.compareTo(str2));

	System.out.println(" contains two string:"+str1.contains(str2));

	System.out.println(" Substring from string:"+str1.substring (2));
	
	System.out.println(" Replaced string:"+str2.replace ("Java","Python"));

	System.out.println(" Find index of o:"+str1.indexOf ('o'));

	System.out.println(" Trimmed string:"+str1.trim());
	}
}
	
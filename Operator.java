class Operator
{
	public static void main(String arg[])
	{
		int a=10;
		int b=20;
		
		//Arithmatic_Operator
		int sum=a+b;
		System.out.println("Addition of Two number:" +sum);
		
		int sub=a-b;
		System.out.println("Substraction of Two number:" +sub);

		int mul=a*b;
		System.out.println("Multiplication of Two number:" +mul);
		
		int div=a/b;
		System.out.println("Division of Two number:" +div);
		
		int mod=a%b;
		System.out.println("Modulas of Two number:" +mod);
		
		//Relational_Operator
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		//Bitwize_Operator
		System.out.println(a&b);
		System.out.println(a^b);
		System.out.println(a|b);
		System.out.println(~b);
		System.out.println(a<<b);
		System.out.println(a>>b);
		System.out.println(a>>>b);
		
		//Logical_Operator
		boolean x=true;
		boolean y=true;
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!(x && y));

		//Assignment_Operator
		System.out.println(a+=b);
		System.out.println(a-=b);
		System.out.println(a*=b);
		System.out.println(a/=b);
		System.out.println(a%=b);
		System.out.println(a^=b);
		System.out.println(a>>=b);
		System.out.println(a<<=b);

		//Misc_Operator
		int max=(a>b)?a:b;
		System.out.println(max);
		
		String str="Hello";
		System.out.println(str instanceof String);	
		
		System.out.println(2+a+b);
		System.out.println(10*a+b);
		
		System.out.println(10*a&b);
		System.out.println(34*a^b);
		System.out.println(15*a|b);
	}
}
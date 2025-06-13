class ComplexNumber
{
double a,b;
public ComplexNumber()
{
	a=0.0;
	b=0.0;
}
public ComplexNumber(double a,double b)
{
	this.a=a;
	this.b=b;
}
public ComplexNumber(ComplexNumber other)
{
	this.a=other.a;
	this.b=other.b;
}

public ComplexNumber add(ComplexNumber other)
{
	return new ComplexNumber(this.a+other.a,this.b+other.b);
}
public String toString()
{
	return "("+a+"+"+b+"i)";
}
}
public class Main
{
	public static void main(String[]args)
	{
	ComplexNumber c1=new ComplexNumber(2.5,3.1);
	ComplexNumber c2=new ComplexNumber(1.5,-2.2);
	ComplexNumber c3=new ComplexNumber(c1);

	ComplexNumber sum=c1.add(c2);

	System.out.println("c1:"+c1);
	System.out.println("c2:"+c2);
	System.out.println("c3:"+c3);
	System.out.println("sum:"+sum);
	}
}
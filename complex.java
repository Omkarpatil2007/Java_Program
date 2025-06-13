import java.lang.*;
class calc
{
	float r,i;
	calc(float a,float b)
	{
		r=a;
		i=b;
	}
	calc() 
	{
      	 	r = 0;
      		i = 0;
   	 }
	void display()
	{
		System.out.println(r+"+i"+i);
	}
	calc add(calc c2)
	{
		calc res = new calc();
		res.r=r+c2.r;
		res.i=i+c2.i;
		return(res);
	}
}

class complex
{
	public static void main(String args[])
	{
	calc c1=new calc(12.5	F,2.5F);
	calc c2=new calc(9.5F,3.4F);
	
	c1.display();
	c2.display();
	
	calc c3=new calc();
	c3=c1.add(c2);
	c3.display();
	
	}
}
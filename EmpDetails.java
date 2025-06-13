interface Salary
{
   double Basic_salary=10000.0;
   void Basic_sal();
}

class Employee
{
   String Name;
   int age;

   Employee(string n,int a)
   {
      Name = n;
      age = a;
   }
   void Display()
   {
      System.out.println("Name:"+Name);
      System.out.println("Age:"+age);
   }
}

class Gross_salary extends Employee implements Salary
{
   double TA,DA,HRA;
   Gross_salary(string n,int a,double b,double c,double d);
   {
      super (n,a);
      TA=b;
      DA=c;
      HRA=d;
   }
   void Basic_sal()
   {
      System.out.println("Basic sal:"+Basic_salary);
   }
   void Total_sal()
   {
      Display();
      Basic_sal();
      int Total_sal=Basic_salary+TA+DA+HRA;
      System.out.println("total sal:"+Total_sal);
   }
}

class EmpDetails
{  
   public static void main(string args[])
   {
      Gross_salary GS=new Gross_salary("omkar",18,1000,2000,7000);
      GS.Total_sal();
   }
}
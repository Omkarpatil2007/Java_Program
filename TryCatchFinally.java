public class TryCatchFinally
{
    public static void main(String[] args) 
   {
    try 
       {
            int a=10,b=0 ,c;
            c= a / b; 
            System.out.println("Result: " + c);
        } 
    catch (ArithmeticException i) 
       {
            System.out.println("Error: Division by zero is not allowed.");
        } 
    finally 
        {
            System.out.println("Execution completed.");
         }
     }
}
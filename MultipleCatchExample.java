public class MultipleCatch
{
    public static void main(String[] args)
    {
        try 
        {

            int[] a = {10, 20, 30};
            System.out.println("Disply array element" +a[5]);

            int a=10,b=0 ,c;
            c= a / b; 
            System.out.println("Result: " + c);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Error:ArrayIndexOutOfBoundsException");
        }
        catch (ArithmeticException i) 
        {
            System.out.println("Error:ArithmeticException Division by zero is not allowed.");
        }
        finally 
        {
            System.out.println("Execution completed.");
        }
    }
}


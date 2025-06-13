public class MultipleCatch
{
    public static void main(String[] args)
    {
        try 
        {

            int[] a= {10, 20, 30};
            System.out.println("Disply array element" +a[5]);

            int b=10,c=0 ,d;
            d= b / c; 
            System.out.println("Result: " + d);
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


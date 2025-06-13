public class TryFinally
{
    public static void main(String[] args) 
    {
        try
        {
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } 
        finally 
        {
            System.out.println("Finally block executed.");
        }
    }
}
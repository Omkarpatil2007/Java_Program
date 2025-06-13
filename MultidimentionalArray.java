import java.util.Scanner;
public class MultidimentionalArray
{
	public static void main(String[]args)
	{
	Scanner scanner = new Scanner(System.in);
	int [][] array= new int [3][3];
	
	System.out.println("enter 9 elment:");
	
	for (int i=0; i<3;i++)
	{
		for (int j=0; j<3;j++)
		{ 
		System.out.print("[" +i+ "] [" +j+ "]");
		array[i][j]=scanner.nextInt();
		}
	}

	System.out.println("\n The 3x3 matrix is:");
	
	for (int i=0; i<3;i++)
	{
		for (int j=0; j<3;j++)
		{ 
		System.out.print("array[i][j]"+"");
		}
		System.out.print();
	}
	scanner.close();
	}
}

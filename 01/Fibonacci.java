import java.io.*;
import java.util.Scanner;
public class Fibonacci
{
	public static void main(String args[])
	{
		int f=0, s=1, t;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit : ");
		int limit = sc.nextInt();
		System.out.print("\nFibonacci series upto the limit are ");
		for(int i = 0; i <= limit; i++)
		{
			if (f <= limit)
			{
				System.out.print("\n" + f);
				t = f + s;
				f = s; 
				s = t;
			}
		}
		System.out.println();
	}
}

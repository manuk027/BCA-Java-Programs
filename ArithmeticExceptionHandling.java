import java.util.Scanner;
public class ArithmeticExceptionHandling
{
  public static void main(String[] args)
  {
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter the dividend:");
    int dividend=scanner.nextInt();
    System.out.print("Enter the divisor:");
    int divisor=scanner.nextInt();
    try
    {
      int result=divide(dividend, divisor);
      System.out.println("Result:" + result);
    }
    catch(ArithmeticException e)
    {
      System.out.println("An ArithmeticException occured:" + e.getMessage());
    }
    finally
    {
      scanner.close();
    }
  }
  public static int divide(int dividend, int divisor)
  {
    if(divisor==0)
    {
      throw new ArithmeticException("Division by zero is not allowed.");
    }
    return dividend/divisor;
  }
}

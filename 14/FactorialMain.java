import P1.Factorial;  
import java.util.Scanner;
public class FactorialMain 
{  
  public static void main(String[] args) 
  {  
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number to find its factorial: ");  
    int number = input.nextInt();  
    long factorial = Factorial.calculateFactorial(number);  
    System.out.println("The factorial of " + number + " is: " + factorial);  
    input.close();  
  }
}

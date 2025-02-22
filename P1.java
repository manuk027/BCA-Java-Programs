package P1;  
public class Factorial 
{  
  public static long calculateFactorial(int n) 
  {  
    if (n == 0 || n == 1) 
    {  
      return 1;  
    } 
    else 
    {  
      return n * calculateFactorial(n – 1);  
    }
  }
}

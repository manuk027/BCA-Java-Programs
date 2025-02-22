import java.util.*;

class MainThread
{
  public static void main(String args[]) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.print(" Enter the limit : ");
    int n=sc.nextInt();
    oddthread o=new oddthread(n);
    eventhread e=new eventhread(n);
    Thread t1=new Thread(o);
    Thread t2=new Thread(e);
    t1.start();
    t2.start();
  }
}

class oddthread implements Runnable
{
  int n;
  oddthread(int x)
  { 
    n=x;
  }
  public void run()
  {
    for(int i=1;i<=n;i+=2) 
    {
      System.out.println(" Odd thread : "+i);
    }
  }
}

class eventhread implements Runnable
{
  int n;
  eventhread(int x)
  {
    n=x;
  }
  public void run()
  {
    for(int i=2;i<=n;i+=2) 
    {
      System.out.println(" Even thread : "+i);
    }
    System.out.println();
  }
}

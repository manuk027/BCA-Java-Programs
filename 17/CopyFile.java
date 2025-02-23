import java.io.*;
public class CopyFile {
  public static void main(String args[]) throws IOException, NullPointerException
  {
    int num;
    FileInputStream fileIn;
    FileOutputStream fileOut;
    try
    {
      try
      {
        fileIn = new FileInputStream(args[0]);
      }
      catch(FileNotFoundException e)
      {
        System.out.println("Input File Not Found.");
        return;
      }
      try
      {
        fileOut = new FileOutputStream(args[1]);
      }
      catch(FileNotFoundException e)
      {
        System.out.println("Error Opening Output File.");
        return;
      }
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Incorrect argument use:java CopyFile Source Destination");
      return;
    }
    try
    {
      do
      {
        num = fileIn.read();
        if(num != -1)
        {
          fileOut.write(num);
        }
      }
      while(num != -1);
    }
    catch(IOException e)
    {
      System.out.println("File Error: Could not copy file.");
    }
    fileIn.close();
    fileOut.close();
    System.out.println("File copied successfully");
  }
}

package Demo;
import java.io.*;
public class FileHandling {
public static void main(String args[])
{
	
try{ 
	File f = new File("D:/Java Programs/Acadview/src/Demo/ab.txt");
	f.createNewFile();
	
    Writer w = new FileWriter("ab.txt");  
    String str = "Assignment 10";  
    w.write(str);  
    w.close();
	
  FileInputStream fin=new FileInputStream("ab.txt");
  FileOutputStream fout=new FileOutputStream("xyz.txt");
  byte b[]=new byte[10];
  int n=fin.read(b);
  System.out.println(n);
  while(n!=-1)
  {
      fout.write(b,0,n); 
      n=fin.read(b);
      }
  System.out.println("Action Completed!");
  fin.close();
  fout.close();
  
  Reader r = new FileReader("xyz.txt");  
  int data = r.read(); 
  
  while (data != -1) {  
      System.out.print((char) data);  
      data = r.read();
   }
  r.close();
}
catch(Exception e)
{
	System.out.println(e);
}
}
}
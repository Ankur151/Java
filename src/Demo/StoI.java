package Demo;

import java.util.Scanner;

public class StoI {
public static void main(String args[])
{
	String a,b;

	Scanner in=new Scanner(System.in);
	
	System.out.println("Enter A");
	a=in.nextLine();
			
			System.out.println("Enter B");
			b=in.nextLine();
			in.close();

			int c=Integer.parseInt(a);
			int d=Integer.parseInt(b);
			
		if(c>d)
			System.out.println("A is greater than B");
		else if(d>c)
			System.out.println("B is greater than A");
		else
			System.out.println("A=B");

			
}
}

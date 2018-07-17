package Demo;

import java.util.Scanner;

public class Allsubs {
public static void main(String args[])
{
	int i,j=0,k=0;
	System.out.println("Enter the String");
	Scanner in=new Scanner(System.in);
	String main=in.nextLine();
	in.close();
	
	for(i=0;i<main.length();i++)
	{
		for(j=i;j<main.length();j++)
		{
			for(k=i;k<=j;k++)
			{
				System.out.print(main.charAt(k));
			}	System.out.println("\n");
		}	System.out.println("\n");
	}
}
}


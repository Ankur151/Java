import java.util.*;
public class Palindrome {
	public static void main (String a[])
	{
		int X,R=0;
		System.out.println("Enter the Number to be checked:");
		Scanner sn=new Scanner(System.in);
		int N= sn.nextInt();
		sn.close();
		X=N;
		System.out.println("The number You Entered:"+N);
		while(N>0)
		{
			R=R*10+N%10;
			N=N/10;
		}
		System.out.println("The Reverse of the Number is:"+R);
	if (R==X)
			System.out.println("The Number is a Palindrome");
		else
			System.out.println("It is not a Palindrome");
	
	}
	}


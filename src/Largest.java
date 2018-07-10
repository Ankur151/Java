import java.util.Scanner;
public class Largest{
	public static void main(String A[])
	{
		
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the first number");
	int a=s1.nextInt();
	System.out.println("Enter the second number");
	int b=s1.nextInt();
	System.out.println("Enter the second number");
	int c=s1.nextInt();
	s1.close();
	
	if(a>b && a>c)
	{
		System.out.println(a+" is the largest of the three");
	}
	else if(b>a && b>c)
	{
		System.out.println(b+" is the largest of the three");
	}
	else if(c>a && c>b)
	{
		System.out.println(c+" is the largest of the three");
	}
	else if((a==c)&&(a>b))
	{
		System.out.println(a+"is the largest of the three");
	}
	else if((a==c )&&(a<b))
		{
			System.out.println(b+"is the largest of the three");
		}
	else if((a==b )&&(a>c))
		{
			System.out.println(a+"is the largest of the three");
		}
	else if((a==b )&&(a<c))
		{
			System.out.println(c+"is the largest of the three");
		}
	else if((b==c )&&(b>a))
		{
			System.out.println(b+"is the largest of the three");
		}
	else if((b==c )&&(a>b))
		{
			System.out.println(a+"is the largest of the three");
		}
	else if((b==c)&&(c==a))
	{
		System.out.println("All the 3 given numbers are equal");
	}
	}
}

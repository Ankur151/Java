import java.util.*;
public class Add {
public static void main(String A[])
{
	int c;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the first number");
	int a=s1.nextInt();
	System.out.println("Enter the second number");
	int b=s1.nextInt();
	s1.close();
	c=a+b;
	System.out.println("Solution: "+a+"+"+b+"="+c);
}
}

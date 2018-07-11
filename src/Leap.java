import java.util.Scanner;
public class Leap {
	public static void main(String a[])
	{
		System.out.println("Enter the Year to be checked:");
		Scanner sn=new Scanner(System.in);
		int N= sn.nextInt();
		sn.close();
		if(N%4==0 ||( N%100==0 && N%400==0))
			System.out.println("It is a leap year");
		else 
			System.out.println("Not a Leap Year");
	}

}

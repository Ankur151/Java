import java.util.Scanner;
public class Prime {
	public static void main(String args[])
	{
		int i;
		boolean flag = false;
		System.out.println("Enter the Number to be checked:");
	Scanner sn=new Scanner(System.in);
	int N= sn.nextInt();
	sn.close();
	for(i=2;i<=N/2;i++)
	{
		if(N%i==0)
		{
			flag = true;
			System.out.println("Divisible by"+i);
			break;
		}
		else
			continue;
	}
	if(flag)
		System.out.println("Not a prime number");
	else
		System.out.println("Prime number");
}
}
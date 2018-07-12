import java.util.Scanner;
public class Waveform {
	public static void main(String args[])
	{

		int i,l,temp=0;
		int A[]= new int[10];
		System.out.println("Enter the elements of Array:");
		Scanner sn=new Scanner(System.in);
		for(l=0;l<10;l++)
		{
			
			A[l]= sn.nextInt();
			
		}
		sn.close();
		for(i=0;i<A.length;i++)
		{
			if(i%2==0)
				continue;
			else
			{
				temp=A[i];
				A[i]=A[i-1];
				A[i-1]=temp;
			}
		}
		System.out.print("Required Array: ");
		for(i=0;i<A.length;i++)
		{
			System.out.print(" "+A[i]);	
		}



}
}
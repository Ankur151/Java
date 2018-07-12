import java.util.Scanner;


public class Sort {
public static void main(String args[])
{
	
	int i,j,l,temp=0;
	int A[]= new int[5];
	System.out.println("Enter the elements of array");
	Scanner sn=new Scanner(System.in);
	for(l=0;l<5;l++)
	{
		
		A[l]= sn.nextInt();
		
	}
	sn.close();
	//System.out.println("Given array: 1 1 1 1 0 0 1 0 ");
	for(i=0;i<A.length-2;i++)
	{
		for(j=i+1;j<A.length;j++)
		{
			if(A[i]>A[j])
			{
				temp=A[i];
				A[i]=A[j];
				A[j]=temp;
			}
		}
	}
	System.out.print("Sorted array: ");
	for(i=0;i<A.length;i++)
	{
		System.out.print(" "+A[i]);	
	}
	
}
	
	
}

import java.util.Scanner;
public class SecondLargest {
public static void main(String args[])
{
	
	int i,j,l,temp=0;
	int A[]= new int[10];
	System.out.println("Enter the elements of array");
	Scanner sn=new Scanner(System.in);
	for(l=0;l<10;l++)
	{
		
		A[l]= sn.nextInt();
		
	}
	sn.close();

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
	System.out.print("Second Largest element="+A[A.length-2]);
	
}
	
	

}

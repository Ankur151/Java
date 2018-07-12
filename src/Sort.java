
public class Sort {
public static void main(String args[])
{
	int i,j,temp=0;
	int A[]={1,1,1,1,0,0,1,0};
	System.out.println("Given array: 1 1 1 1 0 0 1 0 ");
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

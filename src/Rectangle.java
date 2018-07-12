import java.util.Scanner;
public class Rectangle {
int length,breadth;
Rectangle(int A,int B)
{
	this.length=A;
	this.breadth=B;
	
}
	void CalculateArea()
	{
		System.out.println("Area="+length*breadth);
	}
	
public static void main(String args[])
{
	System.out.println("Enter the Length");
	Scanner sn=new Scanner(System.in);
	int q= sn.nextInt();
	System.out.println("Enter the Breadth");
	int w= sn.nextInt();
	sn.close();
	Rectangle r=new Rectangle(q,w);
	r.CalculateArea();
}
}

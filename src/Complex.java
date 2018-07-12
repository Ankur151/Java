import java.util.Scanner;


public class Complex {
int r,i;
	Complex(int r,int i)
	{	this.r=r;
		this.i=i;
	}
	void Display()
	{
		System.out.println("The number is:"+r+"+"+i+"i");
	}
public static void main(String args[])
{
	System.out.println("Enter the Real part");
	Scanner sn=new Scanner(System.in);
	int q= sn.nextInt();
	System.out.println("Enter the Imaginary part");
	int w= sn.nextInt();
	sn.close();
	Complex c=new Complex(q,w);
	c.Display();
}

}

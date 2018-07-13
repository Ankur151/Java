
public class Overload {
int x;
double y;
	void print()
{
	System.out.println("Print No Args!");
}
void print(int x)
{
	this.x=x;
	System.out.println("Print Int:"+x);
}
void print(double y)
{
	this.y=y;
	System.out.println("Print Float"+y);
}
public static void main(String args[])
{
	Overload ol=new Overload();
	
	ol.print();
	ol.print(2);
	ol.print(9.0);

}
}

package Demo;

interface Animals
{
	void speak();
	void eat();
}
class cat implements Animals{

	public void speak()
	{
		System.out.println("Hi,i am kitty!");
	}
	public void eat()
	{
		System.out.println("I eat mouse!");
	}
}
class dog implements Animals{
	public void speak()
	{
		System.out.println("Hi,i am Bruno!");
	}
	public void eat()
	{
		System.out.println("I eat chicken!");
	}
}
public class Interface {
public static void main(String args[])
{
	Animals a=new cat();
	a.speak();
	a.eat();
	
	a=new dog();
	a.speak();
	a.eat();
}
}

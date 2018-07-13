
class Animal{
	String breed,color;
	void speak()
	{
		System.out.println("Speak Function Of animal class");
	}
}
class Dog extends Animal
{
 Dog(String a,String b)
 {
	 this.breed=a;
	 this.color=b;
 }
 void speak()
 {
	 System.out.println("Speak Function Of Dog class");
	 System.out.println("My Name is: "+breed);
 }
}
class cat extends Animal
{
 cat(String a,String b)
 {
	 this.breed=a;
	 this.color=b;
 }
 void speak()
 {
	 System.out.println("Speak Function Of Cat class");
	 System.out.println("My Name is: "+breed);
 }
}
public class Override {

	public static void main(String args[])
	{
		Dog d=new Dog("Pug","Grey");
		d.speak();
		cat c=new cat("Kitty","Golden");
		c.speak();
	}
}

package Demo;

import java.util.Scanner;

abstract class Animal{
	String color,breed,name;
	abstract void eat();
	void speak(String name,String breed,String color)
	{
		this.name=name;
		this.breed=breed;
		this.color=color;
		System.out.println("Hi i am "+name+"\nMy colour is "+color+"\n I am a "+breed);
	}
}
 class dog1 extends Animal{
	void eat()
	{
		System.out.println("I eat Chicken!");
	}
}
public class Abstract {
	public static void main(String args[])
	{
		Animal a=new dog1();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Name");
		String Name=in.nextLine();
				
				System.out.println("Enter Breed");
				String Breed=in.nextLine();
				
				System.out.println("Enter Colour");
				String Color=in.nextLine();
				
				a.speak(Name, Breed, Color);
				a.eat();
				in.close();
	}

}

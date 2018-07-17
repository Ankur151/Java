package Demo;
import java.util.Scanner;
public class RemoveVowels{
 public static void main(String[] args) {
 
	 System.out.println("Enter the String");
		Scanner in=new Scanner(System.in);
		String array=in.nextLine();
		in.close();
	 
        array=array.replaceAll("[aeiouAEIOU]", "");
        System.out.println(array);
 
    }
 
}

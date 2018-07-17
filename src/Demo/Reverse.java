package Demo;
import java.util.Scanner;
public class Reverse
{
    public static void main(String[] args)
    {
        System.out.println("Enter string to reverse:");
        
        Scanner in= new Scanner(System.in);
        String str = in.nextLine();
        String reverse = "";
        in.close();
        
        for(int i = str.length()-1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        
        System.out.println("Reversed string is: "+reverse);
        
    }
}
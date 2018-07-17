package Demo;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Words {

	public static void main(String agrs[]){
		System.out.println("Enter the sentence");
		Scanner in=new Scanner(System.in);
		String sentence=in.nextLine();
		in.close();
		
		StringTokenizer tokens=new StringTokenizer(sentence);
		System.out.println("Number of words in the Sentence: "+tokens.countTokens());
	}
}

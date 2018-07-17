package Demo;

import java.util.Scanner;

class Substring {
	public static void search(String main, String sub)
    {
        int M = sub.length();
        int N = main.length();
 
 
        for (int i = 0; i <= N - M; i++) {
 
            int j;
 
            for (j = 0; j < M; j++)
                if (main.charAt(i + j) != sub.charAt(j))
                    break;
 
            if (j == M)
                System.out.println("sub found at index " + i);
        }
    }
 
    public static void main(String[] args)
    {
    	System.out.println("Enter the String");
    	Scanner in=new Scanner(System.in);
    	String main=in.nextLine();
    	
    	
    	System.out.println("Enter the Sub-String");
    	String sub=in.nextLine();
    	in.close();
    	
    	search(main, sub);
    }
}


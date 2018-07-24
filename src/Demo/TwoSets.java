package Demo;
import java.util.*;
public class TwoSets {


	  public static void main(String args[]) {
	  
	        HashSet<String> h1 = new HashSet<String>();

	          h1.add("one");
	          h1.add("two");
	          System.out.println(h1);
	          HashSet<String>h2 = new HashSet<String>();
	          h2.add("four");
	          h2.add("five");
	          h2.add("two");
	          System.out.println(h2);
	          h2.retainAll(h1);
	          System.out.println("Intersection:"+h2);
	       
	     }


}

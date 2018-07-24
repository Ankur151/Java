package Demo;
import java.util.*;


 class HashM{
public static void main(String args[]){
	
	 
		  HashMap <Integer,String>hash_map= new HashMap <Integer,String>();
		  hash_map.put(1, "one");
		  hash_map.put(2, "two");
		  hash_map.put(3, "three");
		  hash_map.put(4, "four");
		  hash_map.put(5, "five");
		  
		  Set set=hash_map.entrySet();
		  Iterator i=set.iterator();
		  
		  while(i.hasNext()){
		      Map.Entry me=(Map.Entry)i.next();
		      System.out.println(me.getKey()+":");
		      System.out.println(me.getValue()+":");
		  }
		  }
		
}	
	
	
	
	
	
	
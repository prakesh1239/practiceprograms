package arrays;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
   List<String>List1=new ArrayList<String>();
   
 List1.add("Rakesh");
 List1.add("rajesh");
 List1.add("rasi");
 List1.add("Happy");
 List1.add("lekhana");
 System.out.println(List1.size());
 
System.out.println(List1.get(0));
 System.out.println(List1.get(1));
 System.out.println(List1.get(3));
 System.out.println(List1.get(4));
 
 for(int i=0; i < List1.size(); i++) {
	 System.out.println(List1.get(i));
 }
	}
}
	

 



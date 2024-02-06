package arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorAL {

	public static void main(String[] args) {
 List<String> lt=new ArrayList<String>();
 lt.add("rajesh");
 lt.add("rajesh");
 lt.add("rasi");
 lt.add("happy");
 lt.add("lekhana");
 
 Iterator<String> itr=lt.iterator();
 
 while(itr.hasNext()) {
	 String names= itr.next();
	 System.out.println(names);
 }
 

	}

}

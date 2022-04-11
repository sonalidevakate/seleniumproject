package CollectionListpgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReverseArraylist {
public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		System.out.println(al.isEmpty());      //true
		System.out.println(al.size());			//0
		
		al.add("java");  //String
		al.add(50);       //int
		al.add('s');	//char
		al.add("java");	//duplicate value
		al.add(null);   //null value
		System.out.println(al.isEmpty());      //false
		System.out.println(al.size());			//5
		System.out.println(al);			//5

   
		System.out.println("-----------Use of cursor-------------");
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----------Using for loop-------------");

		for(int i=0;i<=al.size()-1;i++) {
		System.out.println(al.get(i));	//5
		}
		Collections.reverse(al);
		System.out.println(al);			//5



}
}


package CollectionListpgm;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorcursor {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		System.out.println(al.isEmpty());      //true
		System.out.println(al.size());			//0
		
		al.add("java");  //total values
		al.add(50);
		al.add('s');
		al.add("java");
		al.add(null);
   
		System.out.println("-----------Use of cursor-------------");
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

package CollectionSet;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		hs.add("abc");
		hs.add('B');
		hs.add("xyz");
		hs.add("abc");      //duplicate not allow
		hs.add(null);  //only one null
		System.out.println(hs);
		System.out.println(hs.isEmpty());  //fasle
		System.out.println(hs.size());     //5
		
		hs.remove("abc");
		
		System.out.println(hs);
		
		System.out.println(hs.contains("bbbb"));   //false bbbb is not present
		
		
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	} 

}
 




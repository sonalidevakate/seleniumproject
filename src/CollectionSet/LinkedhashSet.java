package CollectionSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhashSet {
	public static void main(String[] args) {
					
				LinkedHashSet lh = new LinkedHashSet();  //linkedHashSet is Implementation class of set I/F
					System.out.println(lh.isEmpty()); //true
					System.out.println(lh.size()); //0
					
					lh.add("sss"); //string value
					lh.add("bbb"); //string value
					lh.add(412); //int value
					lh.add('c'); //char value
					lh.add("sss");   // duplicate value is removed
					lh.add(null); //null value
					
					System.out.println(lh);   //[sss, bbb, 412, c, null]  => duplicate sss is removed & order of insertion maintained
					
					System.out.println(lh.isEmpty());  //true
					System.out.println(lh.size());    //5
					lh.remove(null);
					System.out.println(lh); //[sss, bbb, 412, c] null value is removed

					System.out.println(lh.contains("bbb"));    //true
					System.out.println(lh);   //bbb is present        //[sss, bbb, 412, c]
				
					Iterator itr = lh.iterator();  //read all values
					while(itr.hasNext()) {
						System.out.println(itr.next());
					
					}		
			}


}

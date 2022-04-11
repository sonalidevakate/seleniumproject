package CollectionSet;

import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
					
				TreeSet  ts = new TreeSet();  //TreeSet is implementation class for sorted set I/F
					System.out.println(ts.isEmpty()); //true
					System.out.println(ts.size()); //0
					ts.add("sss");		//string value
					ts.add("xyz");		//string value
					ts.add("pqrs");		//string value
					ts.add("sss");    	//duplicate removed not allow
					// ts.add(null);   // Null pointer exception 
					ts.add("aaa"); 		//string value
					ts.add("bbb"); 		//string value
					
					//ts.add(123);	 	//ClassCastException
					ts.add("123");  	//int value declare in double qoute
					
					//ts.add('d'); 		//ClassCastException
					ts.add("d");   		 //char value declare in double qoute
					ts.add("245");
					System.out.println(ts.isEmpty()); //false
					System.out.println(ts.size()); //8
					
					System.out.println(ts); //[123, 245, aaa, bbb, d, pqrs, sss, xyz] order of insertion is ascending order
					System.out.println("---------DIfferent treeset methods-----");
					System.out.println(ts.first());     //123
					System.out.println(ts.last());      //xyz
			
					ts.pollFirst();  //remove first value 
					ts.pollLast();   //remove last value
					
					System.out.println(ts);   //[245, aaa, bbb, d, pqrs, sss]
								
					
				}


}

package CollectionListpgm;

import java.util.ArrayList;


public class CollectionArray {
public static void main(String[] args) {
		
	ArrayList al = new ArrayList();

	System.out.println(al.isEmpty());      //true
	System.out.println(al.size());			//0
	
	al.add("java");  //string values
	al.add(50); //int value
	al.add('b'); //char value
	al.add("java"); //duplicate value
	al.add(null); //null value
	
	System.out.println(al.isEmpty()); //false     
	System.out.println(al.size());     //  total size is 5
	
	System.out.println(al);// display all array values
		
	
}
}			
					
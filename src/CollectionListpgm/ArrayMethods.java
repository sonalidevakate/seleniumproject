package CollectionListpgm;

import java.util.ArrayList;

public class ArrayMethods {
	public static void main(String[] args) {
	
	ArrayList al = new ArrayList();
	
	System.out.println(al.isEmpty());      //true
	System.out.println(al.size());			//0
	
	al.add("java");  //total values
	al.add(50);
	al.add('s');
	al.add("java");
	al.add(null);
	
	System.out.println(al.isEmpty()); //false     
	System.out.println(al.size());     //  total size is 5
	
	System.out.println(al);// display all
	System.out.println("=====================Other methods of ArrayList==================");
	System.out.println(al.get(1));        //50
	System.out.println(al.indexOf('s'));   //2
	System.out.println(al.indexOf("java"));    //0
	
	System.out.println(al.lastIndexOf("java"));    //3
	
	System.out.println("-----------add,remove,set nd contains mthd.----------------------");
	System.out.println(al.contains('s'));    //true
	
	al.add(3,"abc"); //add abc in 3rd index
	
	System.out.println(al);   //[java, 50, b, abc, java, null]
	
	al.set(4, "xyz");        //set xyz in 4th index
	System.out.println(al);   // update java in xyz [java, 50, b, abc, xyz, null]
	
	al.remove(4);   //remove 4th index element         
	
	System.out.println(al); // removed xyz[java, 50, b, abc, null]



}
}
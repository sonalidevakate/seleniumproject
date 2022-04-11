package CollectionListpgm;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList  link = new LinkedList();
		System.out.println(link.isEmpty());    //true
		System.out.println(link.size());       //0
		link.add("abc");
		link.add(50);
		link.add('b');
		link.add("abc");
		link.add(null);
		System.out.println(link.isEmpty());    //false
		System.out.println(link.size());       //5
		System.out.println(link);
		
		System.out.println("------Other methods------");
		System.out.println(link.indexOf('b'));    //2
		System.out.println(link.get(3));          //abc
		System.out.println(link.lastIndexOf("abc"));    //3
		
		System.out.println("------add, remove and set function-----");
		link.add(3, "xyz");
		System.out.println(link);
		link.set(3, "bbbbb");
		System.out.println(link);
		link.remove(3);
		//link.clear();      // to remove all elements from link list then linked list is empty
		System.out.println(link);
		
		System.out.println("------Linked list new method-----");
		link.addFirst(10);
		link.addLast(20);
		System.out.println(link);
		
		
		System.out.println(link.getFirst());   //10
		System.out.println(link.getLast());    //20
		
		link.removeFirst();
		link.removeLast();
		System.out.println(link);
		
		System.out.println("-----------read using iterator-----");
		
		Iterator itr = link.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----Reverse-----------");
		
		Collections.reverse(link);
		
		Iterator revItr = link.iterator();
		
		while(revItr.hasNext()) {
			System.out.println(revItr.next());
		}
		
		
	}

}












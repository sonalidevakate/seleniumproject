package CollectionListpgm;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class ReverseVector {
	public static void main(String[] args) {

		Vector vtr = new Vector();
		System.out.println(vtr.capacity()); // 10
		System.out.println(vtr.size()); // 0
		System.out.println(vtr.isEmpty()); // true
		vtr.add("abc");
		vtr.add(20);
		vtr.add('d');
		vtr.add(null);
		vtr.add("abc");

		System.out.println(vtr.capacity());
		System.out.println(vtr.size()); // 5
		System.out.println(vtr.isEmpty()); // false
		System.out.println(vtr); // [abc, 20, d, null, abc]

		System.out.println(vtr.indexOf(20)); // 1
		System.out.println(vtr.lastIndexOf("abc")); // 4
		
		Enumeration enm = vtr.elements();

		while (enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}

		System.out.println("-----reverse---------");

		Collections.reverse(vtr);

		Enumeration enm1 = vtr.elements();

		while (enm1.hasMoreElements()) {
			System.out.println(enm1.nextElement());
		}

	}


}

package CollectionListpgm;

import java.util.Vector;

public class CollectionVector {
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

		System.out.println(vtr.capacity()); //10
		System.out.println(vtr.size()); // 5
		System.out.println(vtr.isEmpty()); // false
		System.out.println(vtr); // [abc, 20, d, null, abc]

		System.out.println(vtr.indexOf(20)); // 20 index is 1
		System.out.println(vtr.lastIndexOf("abc")); //  last abc index is 4

	}
}

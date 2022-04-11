package CollectionListpgm;

import java.util.Enumeration;
import java.util.Vector;

public class VectorMethods {
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

		System.out.println(vtr.capacity());//10
		System.out.println(vtr.size()); // 5
		System.out.println(vtr.isEmpty()); // false
		System.out.println(vtr); // [abc, 20, d, null, abc]

		System.out.println(vtr.indexOf(20)); // 1
		System.out.println(vtr.lastIndexOf("abc")); // 4
		System.out.println("-----------other methods---------");
		System.out.println(vtr.get(2)); // d
		System.out.println(vtr.contains("java")); // false

		vtr.add(3, "bbbb");

		System.out.println(vtr); // [abc, 20, d, bbbb, null, abc]

		vtr.set(3, "aaaaa");

		System.out.println(vtr); // [abc, 20, d, aaaaa, null, abc]

		vtr.remove(3);
		System.out.println(vtr); // [abc, 20, d, null, abc]

		System.out.println("-----cursor read---------");

		Enumeration enm = vtr.elements();

		while (enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
	}
}

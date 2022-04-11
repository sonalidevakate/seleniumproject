package String;

public class Equals {
	public static void main(String[] args) {
		String s1="Velocity";  //capital v not equal
		String s2="velocity";
		System.out.println(s2.equals(s1)); //false
		System.out.println(s2.equalsIgnoreCase(s1)); //true ignore small, capital
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2,7));

	}

}

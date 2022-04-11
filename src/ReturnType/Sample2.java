package ReturnType;

public class Sample2 {
	public static String Test1(int a,float b) {
		float c= a+b;
		System.out.println(c);
		return "This is java string";
	}
	public static void main(String[] args) {
		System.out.println(Test1(85,94.5f));
	}

}

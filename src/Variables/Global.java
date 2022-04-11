package Variables;

public class Global {
	//int a;
	String str="This is Global variable"; //Global variable declaration
	//String name="Java";
	public void m1() {
		System.out.println("Global variable in m1:" + str);
	}
	public void m2() {
		System.out.println("Global variable in m2:" + str);
	}
	public static void main(String[] args) {
		Global g=new Global();
		g.m1();
		g.m2();
	}
	

}

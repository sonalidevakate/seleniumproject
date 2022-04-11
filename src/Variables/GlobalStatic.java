package Variables;

public class GlobalStatic {
	static float num=55.5f; //static variable or class variable
	public void test1() {
		System.out.println(GlobalStatic.num); //or only num //class name ref use
	}
	public static void test2() {
		System.out.println(GlobalStatic.num);
	}
	public static void main(String[] args) {
		GlobalStatic gs=new GlobalStatic();
		gs.test1();
		test2();
	}

}

package Variables;

public class Test1 {
	String str="This is Java"; //global variable decl.
	public void m1() {
		String str="This java in Local method";
		System.out.println(str); //this will print local value
		System.out.println(this.str); //this will print global value
	}
	public static void main(String[] args) {
		Test1 t1=new Test1();
		t1.m1();
	}

}

package BasicProgramming;

public class Nonstatic {
	public static void main(String[] args) {
		System.out.println("This is main method");
		Nonstatic Ns=new Nonstatic();//object creation or create ref var.
		Test();//static method call
		Ns.Test1();//Non-static method call
	}
	//static method decl.
	public static void Test() {
		System.out.println("This is static method");
		
	}
	//Non-static method decl.
	public void Test1() {
		System.out.println("This is Non-static method");
	}

}

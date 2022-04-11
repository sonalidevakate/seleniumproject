package ThisSuperKeyword;

public class This extends Super {
	int a=20;  //global variable
	public void Test() {
		int a=50; //local variable
		int x=60;
		
		System.out.println(a); //local var.
		System.out.println(x); //local var.


		System.out.println(this.a); //global var.
		System.out.println(super.a); // super class keyword access same var.
	}

	public static void main(String[] args) {
		This t=new This();
		t.Test();
	}

		
	}
	



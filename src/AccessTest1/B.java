package AccessTest1;
import AccessTest.A;
public class B extends A{
	public void Student() {
		System.out.println("This is Student method for access specifier");

	}
	public static void main(String[] args) {
		B bb=new B();
		bb.Sample();
		bb.Student();
	}

}

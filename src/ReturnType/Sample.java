package ReturnType;

public class Sample {
	public int add1() {
		int a=20;
		int b=30;
		int c=a+b;
		return c;
	}
	public int add2() {
		int x=40;
		int y=50;
		int z=x+y;
		return z;
	}
	public static void main(String[] args) {
		Sample s=new Sample();
		System.out.println(s.add1() +s.add2());
		System.out.println(s.add1() *s.add2());
		
		
	}

}

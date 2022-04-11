package ReturnType;

public class Sample1 {
	public int add1(int a, int b,int d) {
		int c=a+b+d;
		return c;
	}
	public static void main(String[] args) {
		Sample1 s= new Sample1();
		System.out.println(s.add1(50,60,75));
	}

}

package ReturnType;

public class Calculator {
	public static int Add(int a, int b) { //static method
		int c=a+b;
		return c;
	}
	public static float Sub(int p, float q) {
		float n=p-q;
		return n;
	}
	public int Mul(int s, int n) { //Non-static method
		int m=s*n;
		return m;
	}
	public static int Div(int x, int y) {
		int z=x/y;
		return z;
	}

}

package ReturnType;

public class ReturnVoid {
	public static void JanBatch(int mul1, int mul2) {
		int mult=mul1*mul2;
		System.out.println(mult);
		int add=mul1+mul2;
		System.out.println(add);
	}
	public static void main(String[] args) {
		JanBatch(10,20);
		JanBatch(80,100);
		JanBatch(81,200);
		
	}

}

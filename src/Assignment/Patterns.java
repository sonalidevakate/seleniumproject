package Assignment;

public class Patterns {
	public void Test() {
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		for (int i =4;i>=1; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Patterns p = new Patterns();
		p.Test();
	}

}

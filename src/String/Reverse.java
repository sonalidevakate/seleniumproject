package String;

public class Reverse {
	public static void main(String[] args) {
		String s = "velocity pune"; // 1space count length12
		String s1 = "velocity pune";
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.print(s1.toUpperCase());
		System.out.println();

		for (int j = s1.length() - 1; j >= 0; j--) {
			System.out.print(s1.toUpperCase().charAt(j));

		}

	}
}

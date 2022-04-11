package Assignment;

public class SeparateCharndNumber {
	public static void main(String[] args) {
		String str="java12345";
		String s=str.replaceAll("[^A-Za-z]", " ");
		String s1=str.replaceAll("[^0-9]", " ");
		System.out.println("separate String....." +s);
		System.out.println("separate number...."  +s1);


	}

}

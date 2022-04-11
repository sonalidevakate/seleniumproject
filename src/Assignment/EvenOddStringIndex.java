package Assignment;

public class EvenOddStringIndex {
	public static void main(String[] args) {
	String[] str=new String[]{"abc","xyz","def","pqr","ijk","mno"};
 	for(int i=0;i<str.length;i++) {

		if(i%2==0) {
			System.out.println("Even string is..."+str[i]);
		}
		else {
			System.out.println("odd string..."+str[i]);

		}


		}
	}
}


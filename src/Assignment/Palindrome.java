package Assignment;

public class Palindrome {
	public void test(int n) {
	int sum=0;
		int res=n;			
		while(n>0) {
			int a = n%10;
			sum=(sum*10)+a;
			n=n/10;
		}

		if(res==sum) {
			System.out.println("palindrome number");
	    }
		else {
		System.out.println(" Not palindrome number");
		}

	}
	public static void main(String[] args)
	{
		Palindrome p=new Palindrome();
		p.test(88);
		p.test(93);

	}
}
	



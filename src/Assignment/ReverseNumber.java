package Assignment;

public class ReverseNumber {
	public static void main(String[] args) {
		int num=9456745;
		int reverse=0;
		System.out.println("original number..." + num);

		while(num!=0) {
			int digit=num%10;
			reverse=reverse * 10 + digit;
			num/=10;
		}
			System.out.println("Reverse number..." + reverse);
		}
	}



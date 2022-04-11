package Assignment;

public class PrintNoWithoutloop {
	public void print(int n) {
		if(n<=10) {
			System.out.println(n);
			print(n+1);
		}
	}
	public static void main(String[] args) {
		PrintNoWithoutloop pn=new PrintNoWithoutloop();
		pn.print(1);
	}
	}

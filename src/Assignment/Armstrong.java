package Assignment;

public class Armstrong {
	public void test(int n) {
		int a;
		int arm=0;
			int res=n;			
			while(n>0) {
				 a = n%10;
				arm=arm+(a*a*a);
				n=n/10;
			}

			if(res==arm) {
				System.out.println("Armstrong  number...");
		    }
			else {
			System.out.println(" Not Armstrong number...");
			}

		}
		public static void main(String[] args)
		{
			Armstrong a=new Armstrong();
			a.test(153);
			a.test(235);

		}
	}
		

	



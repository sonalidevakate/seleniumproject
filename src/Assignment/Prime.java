package Assignment;

public class Prime {
	public void Primeno(int num) {

		for (int i = 0; i <= num; i++) {  //or only odd no. 1 to 100 for(i=1;i<=100;i++){											
											//if(i%2!=0){
		
		}
		
		if (num %2 == 0) {    //even no.
			System.out.println("No. is prime");
		}

		else {
			System.out.println("No. is Not prime");

		}

	}

	public static void main(String[] args) {
		Prime p = new Prime();
		p.Primeno(160);
		p.Primeno(123);
	}
}
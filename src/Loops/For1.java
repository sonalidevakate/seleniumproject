package Loops;

public class For1 {
	public void simple() {
		for(int i=1;i<=5;i++) { //diplay rows means 5 rows
			
		for(int j=1;j<=4;j++) { //diplay colum means 4 colum
			System.out.print("*");
			}
		System.out.println();

	}
	}
	
	public static void main(String[] args) {
			For1 f=new For1();
			f.simple();
		}
	}



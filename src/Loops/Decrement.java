package Loops;

public class Decrement {
	public void Loop() {
	for(int i=5;i>=0;i--) {
		for(int j=0;j<i;j++) {
		System.out.print("*");
		}
		System.out.println();

		}
	}
	public static void main(String[] args) {
		Decrement d=new Decrement();
		d.Loop();
	}
	
	

}

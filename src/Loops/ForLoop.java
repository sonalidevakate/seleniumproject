package Loops;

public class ForLoop {
	public void Increment() {
		for(int i=1;i<=5;i++) { //rows display
			for(int j=0;j<i;j++) {
			//System.out.println(i);
			System.out.print("*");
			}
			System.out.println();

			}
		}
	 	public static void main(String[] args) {
			ForLoop fl=new ForLoop();
			fl.Increment();
		}
	}



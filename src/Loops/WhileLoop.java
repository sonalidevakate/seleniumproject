package Loops;

public class WhileLoop {
	public void While() {
		int a=1;
		while(a<=10) {  //true or false condition
			System.out.println(a);
			a++;
		}
	}
	public static void main(String[] args) {
		WhileLoop w=new WhileLoop();
		w.While();
	}

}

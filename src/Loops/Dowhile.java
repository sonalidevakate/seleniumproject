package Loops;

public class Dowhile {
	public void Do() {
		int a=5;
		do {
			System.out.println(a);
			a++;
		}
		while(a<=10);  //true
	}

	public static void main(String[] args) {
		Dowhile d=new Dowhile();
		d.Do();

}
}

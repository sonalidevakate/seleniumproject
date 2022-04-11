package ReturnType;

public class Test4 {
	public int Test5() { //non-static method
		int num=400;
		return num;
	}
	public static void main(String[] args) {
		Test4 t4= new Test4();
		int abc=t4.Test5();
		System.out.println("This is string" + abc);
	}

}

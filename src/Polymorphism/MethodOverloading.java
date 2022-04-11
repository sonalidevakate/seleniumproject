package Polymorphism;

public class MethodOverloading {
	public void Addition(int a,int b) {  //method name same nd variable is same but arguments diff.
		int add=a+b;
		System.out.println("Addition of two no:" + add);
	}
	public void Addition(int a,int b,int c) {
		int add=a+b+c;
		System.out.println("Addition of three no:" + add);
	}

public static void main(String[] args) {
	
	MethodOverloading p=new MethodOverloading();
	p.Addition(50,70);
	p.Addition(60,80,90);
		
	}
	

}

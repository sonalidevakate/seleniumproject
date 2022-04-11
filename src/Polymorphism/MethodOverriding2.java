package Polymorphism;

public class MethodOverriding2 extends MethodOverriding1 { //methodoverriding2 is subclass nd methodoverridng1 is super class inheritance
	public void over() { //same method name super nd sub clas
		System.out.println("over method2 ");
	}
	public static void main(String[] args) {
		MethodOverriding2 mv=new MethodOverriding2();
		mv.over();
	}
	

}

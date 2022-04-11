package ControlStatement;

public class ElseIf {
	public void Else() {
	int marks=67;

	if(marks>65) {
		System.out.println("Distinction");
	}
	else if(marks >=60 && marks <65) {
		System.out.println("first class");
	}
	else if(marks>=50 && marks<60) {
		System.out.println("second class");
	}
	else 
	{
		System.out.println("Pass");
	}
	}
	public static void main(String[] args) {
		ElseIf ef=new ElseIf();
		ef.Else();
	}
	
}



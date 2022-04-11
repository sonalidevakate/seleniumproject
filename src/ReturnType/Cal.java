package ReturnType;

public class Cal {
	public static void main(String[] args) {
		
		Calculator cl=new Calculator();
		
		System.out.println("This is Addition=" + Calculator.Add(20,30));
		System.out.println("This is Substraction=" + Calculator.Sub(40,30.5f));
		System.out.println("This is Multiplication=" + cl.Mul(100,60));//Non-static method
		System.out.println("This is Division=" + Calculator.Div(200,30));
	}
	

		
	}



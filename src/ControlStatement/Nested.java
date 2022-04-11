package ControlStatement;

public class Nested {
	public void nest() {
		String username="sonali";
		String password="sonali@123";
		if(username=="sonali") {
			System.out.println("username is correct");
		
		if(password=="sonali@123") {
			System.out.println("login succefully");
		}
		}
		
		else {
			System.out.println("invalid username");	
	}
}
	public static void main(String[] args) {
		Nested n=new Nested();
		n.nest();
	}

	}

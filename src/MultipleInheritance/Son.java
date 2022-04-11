package MultipleInheritance;

public class Son implements Parent1, Parent2 {
	public void Home() {
		System.out.println("This is Parent1 Home");
	}

	public void Car() {
		System.out.println("This is Parent1 Car");
	}

	public void Land() {
		System.out.println("This is Parent2 Land");

	}

	public void Income() {
		System.out.println("This is Parent2 Income");

	}

}

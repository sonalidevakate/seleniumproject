package SingleInheritance;

public class RunnerClass{
	public static void main(String[] args) {
		Son ss=new Son();
		ss.Mobile(); //own son class method
		ss.Bike(); //son class method
		
		//Aquired properties in 1st father class
		
		ss.Car();  //father class method
		ss.Money(); //father class method
		ss.Home(); //father class method
	}

}

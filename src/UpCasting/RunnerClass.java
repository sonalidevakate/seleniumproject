package UpCasting;

public class RunnerClass {
	public static void main(String[] args) {
		//Son s = new Son();
		//s.Car();
		//s.Money(); // Fathers property
		//s.Home();
		
		//s.Bike();
		//s.Laptop(); // sons property
		
		//UpCasting
		Father f = new Son(); // create super class to sub class object
		f.Car();
		f.Money();  //returning aquire property to father
		f.Home();
		
		//DownCasting
		Son s1= (Son) f;  //use super class ref object'f'
		s1.Bike();
		s1.Laptop(); 
	}
	
}

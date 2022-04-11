package ControlStatement;

public class Shapes {
	public void  Test() {
		int Sides=3;
		if(Sides==3) {
			System.out.println("Shape of Triangle:" +3);
		}
		else if(Sides==4) {
			System.out.println("Shape of Square:" +4);
		}
		else if(Sides==5) {
			System.out.println("Shape of pentagon:" +5);
		}
		else if(Sides==6) {
			System.out.println("Shape of Hexagon:" +6);
		}
		else {
			System.out.println("Invalid Shape");
		}
	}
	public static void main(String[] args) {
		Shapes s=new Shapes();
		s.Test();
		
	}
	

}

package Polymorphism;

public class Areaofcircle {
	public void Area(int r) {
		float area=3.14f*r;
		System.out.println("Area1 is: " +area);
	}
	public void Area(float r) {
		float area=3.14f*r;
		System.out.println("Area2 is: " +area);
	}
	public static void main(String[] args) {
		Areaofcircle a=new Areaofcircle();
		a.Area(50);
		a.Area(80.8f);
	}


}

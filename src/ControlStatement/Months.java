package ControlStatement;

public class Months {
	public void monthdays() {
		int Days=29;
		if(Days==29) {
			System.out.println("months having 28 days => feb");
			System.out.println("months having 29 days => feb");
		}
		else if(Days==30) {
			System.out.println("months having 30 days => Apr,June,Sep,Nov");
		}
		else if(Days==31) {
			System.out.println("months having 31 days => Jan,mar,may,jul,aug,oct");
		}
		else {
			System.out.println("Invalid Months");
			
		}
	}
	public static void main(String[] args) {
		Months m=new Months();
		m.monthdays();
	}
	

}

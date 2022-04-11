package ControlStatement;

public class Switch {
	public void Test(int day) { //parameter
		//int day=4;
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			default:
				System.out.println("Invalid Day");
		}
	}
	public static void main(String[] args) {
		Switch s=new Switch();
		s.Test(1);
	}

}

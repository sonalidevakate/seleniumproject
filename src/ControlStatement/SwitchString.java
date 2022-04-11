package ControlStatement;

public class SwitchString {
	public void Test() {    
		String day="THUR";
		switch(day) {
		case "MON":
			System.out.println("Monday");
			break;
		case "TUE":
			System.out.println("Tuesday");
			break;
		case "WED":
			System.out.println("wednesday");
			break;
		case "THUR":
			System.out.println("Thursday");
			break;
		case "FRI":
			System.out.println("Friday");
			break;
		case "SAT":
			System.out.println("Saturday");
			break;
		case "SUN":
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid Day");
		}
	}
	public static void main(String[] args) {
		SwitchString s1=new SwitchString();
		s1.Test();
	}

}



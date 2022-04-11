package ControlStatement;

public class SwitchChar {
	
	public void Test(char day) {    
		//char day='D';
		switch(day) {
		case 'A':
			System.out.println("Monday");
			break;
		case 'B':
			System.out.println("Tuesday");
			break;
		case 'C':
			System.out.println("wednesday");
			break;
		case 'D':
			System.out.println("Thursday");
			break;
		case 'E':
			System.out.println("Friday");
			break;
		case 'F':
			System.out.println("Saturday");
			break;
		case 'G':
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid Day");
		}
	}
	public static void main(String[] args) {
		SwitchChar s1=new SwitchChar();
		s1.Test('D');
	}

}




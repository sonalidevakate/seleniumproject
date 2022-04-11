package String;

public class Length {     
	public static void main(String[] args) {   // velocityo ->string
												//0123456789 ->value or length
		String s="velocityo"; //length 9 starts with zero    
		System.out.println(s.toUpperCase());  //VELOCITYO <-o is double char
		System.out.println(s.toLowerCase());  //velocity
		System.out.println(s.length());       //9
		System.out.println(s.indexOf("o"));   //3
		System.out.println(s.lastIndexOf("o")); //8
		System.out.println(s.startsWith("ve"));//true
		System.out.println(s.endsWith("y")); //false
		System.out.println(s.charAt(1)); //e
		System.out.println(s.substring(5)); //ityo

		
		
	}

}

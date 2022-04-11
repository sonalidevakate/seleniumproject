package Assignment;

public class FirstCharCapital {
	public static void main(String[] args) {
		String str="this is java program";
		String[] s=str.split(" ");
		for(String s1:s) {  
			String s2=s1.substring(0,1);
			String s3=s1.substring(1);
		
			System.out.print(s2.toUpperCase()+s3 +" ");
		}
}
}



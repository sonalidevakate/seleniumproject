package Assignment;


public class CharCountofString {
	public static void main(String[] args) {
		String str="This is java string";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println(" char count is " + count);
		
}
}




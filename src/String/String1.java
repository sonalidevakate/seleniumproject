package String;

public class String1 {
	public void str() {
		//constant pool area
		String s="sonali";
		String s1="sonali";
		System.out.println(s==s1);
		//System.out.println(s.equals(s1));
		//System.out.println(s.equalsIgnoreCase(s1));  //string lib. method


		
		//non constant pool area
		String s2=new String("Anshika");
		String s3=new String("Anshika");
		//System.out.println(s2==s3);
		System.out.println(s2.equals(s3));

	}
	public static void main(String[] args) {
		String1 s=new String1();
		s.str();

		
		
	}

}

package Arrays;
import java.util.Arrays;
public class SortedArray {
	public static void main(String[] args) {
		String[] s=new String[5]; //array size is 5
		s[0]="sonali";
		s[1]="anshika";
		s[2]="anya";
		s[3]="aarav";
		s[4]="aradhya";
		
		//System.out.println(s.length);

		for(int i=0;i<=4;i++) {
			System.out.println(s[i]); //i var.
		}
			System.out.println("-------sorted array-------");
			Arrays.sort(s);  //sort array use s is var.
			for(int i=0;i<=4;i++) {
			System.out.println(s[i]);
			}
	}
}

		



package Arrays;
import java.util.Arrays;

public class AscendDescend {
	public static void main(String[] args) {
		int[] s=new int[5]; //array size is 5
		s[0]=45;
		s[1]=35;
		s[2]=75;
		s[3]=30;
		s[4]=50;
		
		//System.out.println(s.length);

		for(int i=0;i<=4;i++) {
			System.out.println(s[i]); //i var.    //ascending order
		}
			System.out.println("-------sorted array in ascending order-------");
			Arrays.sort(s);  //sort array use s is var.
			for(int i=0;i<=4;i++) {
			System.out.println(s[i]);
			}
			
			//Descending order
			System.out.println("--------sorted array in descending order------");
			for(int i=4;i>=0;i--) {
				System.out.println(s[i]);

				
			}

}
}

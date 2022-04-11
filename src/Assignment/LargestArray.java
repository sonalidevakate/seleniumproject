package Assignment;

import java.util.Arrays;

public class LargestArray {
	public static void main(String[] args) {

		int [] ar= new int[]{25,11,7,75,56};
		int max=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		System.out.println("Largest array...."+max);
		
	}
}
}



package Assignment;

import java.util.Arrays;

public class LargestArray1 {
	public static int getLargest(int[]a,int larg) {
		Arrays.sort(a);
		return a[larg-1];
	}
	public static void main(String[] args) {
		int a[]= {10,11,22,56,7}; //5
		System.out.println("Largest array:" +getLargest(a, 5)); //5 is size of array
	}

}

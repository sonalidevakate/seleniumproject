package Assignment;

public class DescendingArray {
	public static void main(String[] args) {
		int[] ar=new int[] {12,34,67,80,99,20};
		int temp=0;
		System.out.println("----original array elements-----");

		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]+ "");
		}
		System.out.println("----sort array descending order-----");
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) { //without using Array.sort() mthd.
				if(ar[i]<ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
			System.out.println("----after sorting  array descending order-----");

				for(int i=0;i<ar.length;i++) {
					System.out.println(ar[i]);
			}
		}
	}





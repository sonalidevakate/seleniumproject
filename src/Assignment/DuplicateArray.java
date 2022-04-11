package Assignment;

public class DuplicateArray {
	public static void main(String[] args) {
		int[] arr={10,22,43,77,8,99,22};
		System.out.println("Duplicate elements in given array is....");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}

}

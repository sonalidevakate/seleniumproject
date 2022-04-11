package Assignment;

public class LengthofEachword {
	public static void main(String[] args) {
		
	String str="This is java string";
	String[] temp=str.split(" ");
	for(int i=0;i<temp.length;i++) {
		System.out.println(temp[i]+ " word length is  "+temp[i].length());
	}

}
}

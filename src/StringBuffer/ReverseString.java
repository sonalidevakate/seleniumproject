package StringBuffer;

public class ReverseString {
	public void string() {
		String str="This is java";
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		System.out.print(sb);
		sb.append(str);

	}
	public static void main(String[] args) {
		ReverseString rs=new ReverseString();
		rs.string();

	}

}

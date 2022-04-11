package Assignment;

public class Firstcharcapital2 {
	public static void main(String[] args) {
		String[] str= {"this is java program"};
	
		for(int i=0;i<str.length;i++)
		{
			StringBuffer sb=new StringBuffer();
	
			char[] ch=str[i].toCharArray();
			for(int j=0;j<ch.length;j++)
			{

				if(j==0)
				{
					sb.append(str[i].toUpperCase());
				}
				else
				{
					sb.append(ch[j]);
					}
					System.out.println(sb + "");
				}
			}
	}
}
	


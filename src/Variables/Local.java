package Variables;

public class Local {
	public void m1() {
	int a=550; //local variable declaration
	String str="Sonali";
	System.out.println(a);
	System.out.println(str);
   }
	public static void main(String[] args) {
		Local lv=new Local();
		lv.m1();

}
}

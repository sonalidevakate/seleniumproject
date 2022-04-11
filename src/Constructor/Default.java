package Constructor;

public class Default {
	int EmpID;
	String EmpName;
	float salary;
	int MobNo;
	public void Test() {

		System.out.println(EmpID);
		System.out.println(EmpName);
		System.out.println(salary);
		System.out.println(MobNo);
	}
	public static void main(String[] args) {
		Default d=new Default();
		d.Test();
	}


}

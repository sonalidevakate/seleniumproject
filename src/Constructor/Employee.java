package Constructor;

public class Employee {
	int EmpID;
	String EmpName;
	float salary;
	int MobNo;
	Employee(){  //Non parameterized constructor
		EmpID=2001;
		EmpName="Sonali";
	}
	Employee(int a,String str){ //parameterized constructor
		this();
		EmpID=a;
		EmpName=str;
	}
	Employee(int a,float b,int y){
		//this();
		EmpID=a;
		salary=b;
		MobNo=y;
	}
	public void Demo() {
		
		System.out.println(EmpID);
		System.out.println(EmpName);
		System.out.println(MobNo);
		System.out.println(salary);

	}
	public static void main(String[] args) {
		Employee em=new Employee();
		em.Demo();
		Employee em1=new Employee(1001,"Anshika");
		em1.Demo();
		Employee em2=new Employee(101,10.5f,998876);
		em2.Demo();
		//System.out.println(em.EmpID);
		//System.out.println(em1.EmpID);
	
		
	}

}

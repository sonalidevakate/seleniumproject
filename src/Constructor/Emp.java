package Constructor;

public class Emp {
	int EmpID;
	String EmpName;
	float salary;
	int MobNo;
	Emp(){  //Non parameterized constructor
		EmpID=2001;
		EmpName="Sonali";
	}
	Emp(float a,int b){ //parameterized constructor
		salary=a;
		MobNo=b;
	}
	public void Emps() {
		System.out.println(EmpID);
		System.out.println(EmpName);
		System.out.println(salary);
		System.out.println(MobNo);
	}
	public static void main(String[] args) {
		Emp e=new Emp();
		e.Emps();
		Emp em=new Emp(10.5f,996645);
		em.Emps();
	}

		
	}



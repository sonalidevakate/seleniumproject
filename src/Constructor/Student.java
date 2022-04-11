package Constructor;

public class Student {
	int StudId;
	String StudName;
	float Marks;
	int MobNo;
	Student(){  //Non parameterized constructor
		StudId=05;
		StudName="Sonali";
		Marks=85.5f;
		MobNo=99456;
	}
	
	Student(int a,String str,float b,int c){  //parameterized constructor
		StudId=a;
		StudName=str;  //first constr. variables use. 1st constr. initialize
		Marks=b;
		MobNo=c;
		
	}
	public void Stud() {
		System.out.println(StudId);
		System.out.println(StudName);
		System.out.println(Marks);
		System.out.println(MobNo);
			}
	public static void main(String[] args) {
		Student s=new Student();
		s.Stud();
		Student ss=new Student(8,"Anaya",80.6f,998877);
		ss.Stud();
		
	}

}

package Constructor;

public class Student1 {
	int StudId;
	String StudName;
	float Marks;
	int MobNo;
	Student1(){  //Non parameterized constructor
		StudId=05;
		StudName="Sonali";
		Marks=88.5f;
		MobNo=99456;
	}
	
	
	public void Stud() {
		System.out.println(StudId);
		System.out.println(StudName);
		System.out.println(Marks);
		System.out.println(MobNo);
			}
	public static void main(String[] args) {
		Student1 s=new Student1();
		s.Stud();
	}
}

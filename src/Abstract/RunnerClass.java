package Abstract;

public class RunnerClass  {
	public static void main(String[] args) {
		//Sample s=new Sample(); //create obj in sub class sample
		//s.Test(); //complete method1 in demo class
		//s.Test1(); //complete method2 in sample class
		NewSample ns=new NewSample();
		ns.Rect();
		ns.Test();
		ns.Test1();
		
	}

}

package Generalization;

public class RunnerClass {
	public static void main(String[] args) {
		Airtel a=new Airtel();
		a.Sms();
		a.Calling();
		a.Data();
		
		Jio j=new Jio();
		j.Sms();
		j.Calling();
		j.Data();
		
		BSNL b=new BSNL();
		b.Sms();
		b.Calling();
		b.Data();
		
		Idea i=new Idea();
		i.Sms();
		i.Calling();
		i.Data();
		
	}

}

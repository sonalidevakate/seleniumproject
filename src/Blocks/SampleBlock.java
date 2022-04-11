package Blocks;

public class SampleBlock {
	{
		System.out.println("Non-static block"); //nonstatic block
	}
	static   //1st static bolck will be executed then non-static
	{
		System.out.println("Static block");//static block using static keyword
	}
	SampleBlock(){ //constructor
		System.out.println("Constructor");
	}
	public void sample() { //non static method
		System.out.println("Non-static method");
	}
	public static void main(String[] args) {
		SampleBlock sb=new SampleBlock();
		sb.sample();
	}

}

package Blocks;

public class Block {
	
	{
		System.out.println("Non-static");

	}
	static
	{
		System.out.println("static");
	}
	public static void main(String[] args) {
		Block b=new Block();
		
	}

}

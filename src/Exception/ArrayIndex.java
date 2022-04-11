package Exception;

public class ArrayIndex {
	public static void main(String[] args) {
		String[] ar= {"sonali","Anshika","Anaya"};
		System.out.println(ar.length);
	try
	{
		System.out.println(ar[4]);
	}
	catch(ArrayIndexOutOfBoundsException e )
	{
		System.out.println("ArrayIndexOutOfBounds Exception and it is handeled");
	}
	System.out.println("---End of program---");

	}
}

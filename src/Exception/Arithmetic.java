package Exception;

public class Arithmetic {
	
		public static void main(String[] args){
			int a=10;
			int b=0;
		try
		{
			int c=a/b;  //risky code
			System.out.println(c);

		}
		catch(ArithmeticException  e)
		{
			System.out.println("ArithmeticException handled");
		}
		catch(NullPointerException e )
		{
			System.out.println("Null Pointer Exception and it is handeled");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		catch(Exception e)
		{
			System.out.println("Generic Exception handled");
		}
	
		System.out.println("---This is last line---");

	}
	}




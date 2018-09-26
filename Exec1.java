
public class Exec1
{
	public static void main(String[] args)
	{

		//System.out.println("abc");//we can do
		try
		{
		System.out.println(10/2);
		System.out.println(10/3);
		System.out.println(10/10);
		System.out.println(10/4);
		System.out.println(10/0);
		System.out.println(10/3);
		
		
		}
		
		//System.out.println("abc");//we cant do
		catch(RuntimeException ae)
		
		{
			System.out.println(ae);
			System.out.println(ae.getMessage());
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		//System.out.println("abc");//we cant do

	/*		finally
		{
			System.out.println("Finally Block");
		}	*/
	//	System.out.println("abc");//we can do
	} 
}
public class StackPr
{
	void m1()
	{
		m2();
	}
	void m2()
	{
		m3();
	}
	
	void m3()
	{
		//System.out.println(10/0);
	try
	{
		System.out.println(10/0);
	}

	catch(ArithmeticException ae)
	 {
		//ae.printStackTrace();
		System.out.println(ae);	
	 }
	}
}

class Main
{
	public static void main(String[] args)
	{
		new StackPr().m1(); //output is stack trace
	}
}
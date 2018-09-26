public class FMethod
{
	private FMethod()
	{}
	
	void show()
	{System.out.print("SHOW");}

void display()
{System.out.println("hiii");}
	static FMethod get()
	{return new FMethod(); }

}


class Main
{
	 static void main(String[] args)
	{
		//FMethod a=new FMethod();
		FMethod b=FMethod.get();
		b.show();
	}
}
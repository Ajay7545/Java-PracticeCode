abstract  public class AbsEx
{
	abstract void m1();
	abstract void m3();
	void m2()
	{System.out.println("2 ");}
}

 abstract class  Abs2 extends AbsEx //partial implementation for abs2
{
	void m1()
	{System.out.print("1");}

}
class Abs3 extends Abs2
{
	void m3()
	{System.out.print("3");}
}

class Main
{
	public static void main(String[] args)
	{Abs3 a=new Abs3();
		a.m2();
		a.m1();
		a.m3();
	}
}
public class OverrideEx
{
protected void calc(int a,int b)
	{System.out.println("Total="+(a+b));}
	
protected	void display(int x)
	{System.out.println("Num="+x);}

}

class Over5 extends OverrideEx
{
 protected	void display(String s)
{	
	System.out.println("Str="+s);}

protected  void calc(int x,int y)
{System.out.println("Product="+(x*y));}

}

class Main
{
	public static void main(String [] args)
{/*Over5 r=new Over5();
r.display("A string");
r.calc(4,4);

r.display(5);*/
OverrideEx d=new Over5();
d.calc(9,9);
d.display(5);

}

}
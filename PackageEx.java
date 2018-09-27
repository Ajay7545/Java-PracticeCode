import Pack.*;
import Pack.calc.Calculator;
public class PackageEx
{
public static void main(String[] args)
{
	Pack.Add a=new Pack.Add();
	String g=a.add(4,10);
	System.out.print(g);
	
	Calculator c=new Calculator();
	c.product(4,3);
	Pack.calc.Add b=new Pack.Add();
	b.test();

}

	
}
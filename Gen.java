import java.util.*;

public class Gen<E>

{ E ob;

	
	Gen(E x)
	{
		ob=x;
	}
	E get()
	{
		return ob;
	}

	void getType()
	{
		System.out.println("Type="+ob.getClass());

	}
}
class Main
{
public static void main(String ar[]) 
{
	Gen<Integer>i=new Gen<Integer>(10);
	int j=i.get();
	System.out.println(j);
	i.getType();
	Gen<String>s=new Gen<String>("ABC");
	String n=s.get();
	System.out.println(n);
	s.getType();

}
}

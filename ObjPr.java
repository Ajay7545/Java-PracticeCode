public class ObjPr
{
	public String  toString()
	{
		return "My Class";
	}

	
}

class Main
{
	public static void main(String[] args)
	{
	ObjPr a=new ObjPr();
	ObjPr b=new ObjPr();
	System.out.println(a);
	System.out.println(b);
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
	}
}
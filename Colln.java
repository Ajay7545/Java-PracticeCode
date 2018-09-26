import java.util.*;
class Abc{}
class Xyz{}

public class Colln
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		System.out.println(al);
		Abc a=new Abc();
		Xyz b=new Xyz();
		String c="java";
		int d=100;


		al.add(a);
		al.add(b);
		al.add(c);
		al.add(d);		

/*	Object[] xy=al.toArray();
			for(Object mb:xy)
			{
				System.out.println(mb);
			}

*/

		ArrayList al2=new ArrayList();
		al2.add("2-One");
		al2.add("2-Two");
		al2.add("2-Three");

		System.out.println(al2);
		System.out.println(al);
		al.addAll(al2);
		System.out.println(al);
		al.removeAll(al2);
		System.out.println(al);



		Abc cb=(Abc)al.get(0);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());

		boolean n=al.contains(b);
		System.out.println(n);

		boolean k=al.remove(b);
		System.out.println(k);

		al.clear();
		System.out.println(al.size());
		



	

	}
}
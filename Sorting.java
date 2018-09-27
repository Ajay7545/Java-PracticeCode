import java.util.*;
class Person
{
	String name;
	Person(String name)
	{
	this.name=name;
	}
}
public class Sorting
{
	public static void main(String[] args) 
	{
		ArrayList<Person>list=new ArrayList<Person>();
		list.add(new Person("AMIT"));
		list.add(new Person("AJAY"));
		list.add(new Person("VIKAS"));
		list.add(new Person("ASCDA"));
 
Collections.sort(list,(Person p1,Person p2)->p1.name.compareTo(p2.name));
		Collections.sort(list,new Comparator<Person>()
		{
			public int compare(Person p1,Person p2)
			{return p1.name.compareTo(p2.name);}
		});*/
		Iterator i=list.iterator();
		while(i.hasNext())
		{
			Person p=(Person)i.next();
			String g=p.name;
			System.out.println(g);

		}
		}

}

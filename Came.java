import java.util.*;
public class Came
{


public static void main(String[] args) 
{
	HashSet<String> hs =new HashSet<String>();
	hs.add("Two");
	hs.add("Five");
	hs.add("Three");
	hs.add("One");
	hs.add("Four");

	System.out.println(hs);

	hs.add("One");
	System.out.println(hs);		
}
}
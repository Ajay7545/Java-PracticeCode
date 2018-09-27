import java.util.*;

public class HM
{


public static void main(String[] args) 
{
HashMap<Integer,String> hm = new HashMap<Integer,String>();
	hm.put(1,"One");
	hm.put(5,"Five");
	hm.put(4,"Four");
	hm.put(3,"Three");
System.out.println(hm);
System.out.println("Key="+hm.ContainsKey(3));
System.out.println("Value="+hm.ContainsValue("Three"));
hm.put(3,"Thirty");
System.out.println(hm);
System.out.println("Key="+hm.ContainsKey(3));
System.out.println("Value="+hm.ContainsValue("Three"));



}
}
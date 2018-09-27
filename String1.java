public class String1
{
	public static void main(String[] args)
	{

		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb=sb.append(" java ");
		System.out.println(sb);

		sb=sb.append(" class ");
		System.out.println(sb);

		sb=sb.insert(5,"Xyz");
		System.out.println(sb);
		
		sb=sb.delete(5,8);
		System.out.println(sb);


		sb.reverse();
		System.out.println(sb);
		
		sb=sb.reverse();
		System.out.println(sb);


		String g="HelloWorld";
		String G="Hello World";
	//String t=replace("HelloWorld" ,"Hello World");
    //System.out.println(t);
		//int t=g.lastIndexOf("World");
		//String t=g.toUpperCase();
		//String t=g.toLowerCase();
		//System.out.println(t);
		

		/*System.out.println("Abc".equals("Abc"));
		System.out.println("Abc".equals("A bc"));
		System.out.println("Abc".equalsIgnoreCase("ABC"));
		System.out.println("Abc".equalsIgnoreCase("A BC"));*/


		//System.out.println(g.substring(3));
		//System.out.println(g.substring(3,8));
		//System.out.print(t);
		//System.out.println(" A      B     ".length());
		//System.out.println(" A      B      ".trim().length());
	/*
	char []cc=g.toCharArray();
	for(char ra:cc)
	{System.out.println(ra);}
    */
	/*int num=20;
	String gn=String.valueOf(num);
	System.out.println(num+num);
	System.out.println(gn+gn);
	*/



	}

}

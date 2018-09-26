public class Equals
{
	public static void main(String[] args)
	{
		String r1=new String("java");
		String r2=new String("java");
		String r3=new String(r2);
		String r4="java";
		String r5=r2;
		String r6="java";
		System.out.println(r1==r2);
		System.out.println(r2==r3);
		System.out.println(r3==r4);
		System.out.println(r2==r5);
		System.out.println(r4==r5);
		System.out.println(r4==r6);
		System.out.println(r5==r6);
		System.out.println(r5.equals(r6));
		



	}
}
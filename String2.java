public class String2
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
	}
}
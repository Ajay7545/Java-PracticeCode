public class WrapEx
{
public static void main(String[] args)
{
int a=20;
int k=2;

Integer b=new Integer(a); //boxing
Integer c=new Integer("30");

int d=b.intValue(); //d e unboxing
int e=c.intValue();
System.out.println(++d);
System.out.println(++e);

Integer r=20;

System.out.println(++r); //autoboxing

}

}
public class ConstEx
{

ConstEx(int a,int b)
{
System.out.println("total="+ (a+b));
}

ConstEx()
{
this("abc");
System.out.println("Default");
}

ConstEx(String s)
{
this(7,10);
System.out.println("Str="+s);
}

}

class Main
{
public static void main(String[] args)
{
new ConstEx();
//new ConstEx("Ajay");
//new ConstEx(1,5);
}

}



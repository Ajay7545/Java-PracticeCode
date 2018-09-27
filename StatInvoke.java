public class StatInvoke
{
static void m1()
{System.out.println("One");
m2();}
static void m2()
{System.out.println("Two");
}
static int m=10;

}

class Main
{
public static void main(String args[])
{//new StatInvoke().m1();
 StatInvoke.m2();
System.out.println(--StatInvoke.m);
}
}
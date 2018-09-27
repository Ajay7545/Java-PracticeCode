public class InheritEx
{
int a;
void show1()
{System.out.println("1 method");
System.out.println("value of p is "+ --p);
}
private int p=10;
}

class Inherit2 extends InheritEx
{
void show2()
{System.out.println("2 method"+ ++a);
show1();
}
}

class Main
{
public static void main(String[] args)
{//InheritEx f=new Inherit2();
//f.show1();

InheritEx t=new InheritEx();
System.out.println(t.a);
t.show1();
//System.out.println(t.p);
}
}
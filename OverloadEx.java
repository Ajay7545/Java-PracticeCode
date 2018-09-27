public class OverloadEx
{
void display(int a)
{System.out.println("num="+a);}

void display(int x,String y)
{System.out.println("Number="+x);
System.out.println("Str="+y);}

void display(String a,int b)
{System.out.println("Value="+a+b);}

void display(String t)
{System.out.println("str="+t);}

/*int display(String s)
{return 1;}
}*/

class Main
{
public static void main(String[] args)
{OverloadEx l=new OverloadEx();
l.display(12,"Abc");
l.display("Ajay");
l.display("abc",3);
l.display(46);}

}
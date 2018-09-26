public class FMethod1
{
private FMethod1()
{}
void show()
{System.out.println("show");}

}


class Main
{
public static void main(String[] args)
{
FMethod1 f=new FMethod1();
f.show();
}


}

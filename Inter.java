public interface Inter
{
	int v=10;
	void show1();
}
class Abc implements Inter
{
public	void show1()
	{
		System.out.print("S="+ (v+v));
    }
}

interface I2
{void show2();
}
interface I3 extends I2,Inter
{void show3();}

class Ab extends Abc implements Inter,I3
{
	public void show2()
	{System.out.print("s2");}

	public void show3()
	{System.out.print("s3");}
} 

class Main
{
	public static void main(String ar[] )
	{
		Ab a=new Ab();
		a.show1();
		a.show2();
		a.show3();
	}
}

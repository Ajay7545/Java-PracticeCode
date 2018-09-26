import java.io.*;

public class CheckedEx
{
	public static void main(String[] args) throws FileNotFoundException
	{
	try
		{FileOutputStream f=new FileOutputStream("F.txt");}
	catch(FileNotFoundException fn)
	{
		System.out.println(fn);
	}
	}
}
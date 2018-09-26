import java.io.File;

public class FileEx
{
	public static void main(String[] args)
	{
	File c=new File("C:/Windows");
	if(c.isDirectory())
	{
	File ff[]=c.listFiles();
	for(File m:ff)
	{
	System.out.println(m.getName()+" "+m.length());
	}
	}
	else if(c.isFile())
	{System.out.println("ITS a file");}
	else 
	{System.out.println("false no directory");}




	/*File f=new File("F:/Study/Jiit/cs/s.pdf");
	
	System.out.println("Parent="+f.getParent());
	System.out.println("Name="+f.getName());
	System.out.println("Size in Bytes="+f.length());

	System.out.println("a//ja\\y");
	boolean b=f.exists();
	System.out.println(b);
	b=f.isDirectory();
	System.out.println(b);
	b=f.isFile();
	System.out.println(b);*/

}

}
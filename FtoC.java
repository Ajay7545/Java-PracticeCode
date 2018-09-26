import java.io.*;
public class FtoC
{
public static void main(String[] args) throws IOException
{
FileInputStream fis=new FileInputStream("F2.txt");
int n;
	while((n=fis.read())!=-1)
	{System.out.println(n);}
}
} 
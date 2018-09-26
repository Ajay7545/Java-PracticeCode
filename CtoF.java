import java.io.*;
public class CtoF
{
public static void main(String[] args) throws IOException
{
FileOutputStream fos= new FileOutputStream("F2.txt");
DataInputStream dis= new DataInputStream(System.in);
int n;
for(int i=1;i<=5;i++)
{
System.out.println("Enter Number"+i+":");
String st=dis.readLine();
n=Integer.parseInt(st);
fos.write(n);
}


}

}

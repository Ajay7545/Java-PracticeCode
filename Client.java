import java.io.*;
import java.net.*;
public class Client
{
public static void main(String[] args) throws IOException,UnknownHostException
{
Socket s=new Socket("localhost",2000);
while(true)
{DataInputStream dis=new DataInputStream(System.in); //for reading from where keyboard 
System.out.println("Enter a String");
String st=dis.readLine();
PrintStream ps=new PrintStream(s.getOutputStream()); //where to write
ps.println(st);
dis=new DataInputStream(s.getInputStream());
st=dis.readLine();
System.out.println("From Server="+st);
}

}


}
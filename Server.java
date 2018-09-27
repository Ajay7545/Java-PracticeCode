import java.io.*;
import java.net.*;
public class Server
{
public static void main(String[] args) throws IOException
{
	ServerSocket ss=new ServerSocket(2000);
Socket s=ss.accept();
PrintStream ps = new PrintStream(s.getOutputStream());
while(true)
{
	DataInputStream dis=new DataInputStream(s.getInputStream());
	String st=dis.readLine();
System.out.println("From Server="+st);
System.out.println("Enter a string");
dis=new DataInputStream(System.in);
st=dis.readLine();
ps.println(st);

}

}


}
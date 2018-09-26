import java.io.*;
public class FtoF
{
public static void main(String[] args) throws IOException
{
FileInputStream fis=new FileInputStream("Login.java");
DataInputStream dis=new DataInputStream(fis);
FileOutputStream fos=new FileOutputStream("F3.java");
DataOutputStream dos=new DataOutputStream(fos);
String m;
while( (m=dis.readLine()) !=null)
{
dos.writeBytes(m);
dos.writeBytes("\n");
}


}

}

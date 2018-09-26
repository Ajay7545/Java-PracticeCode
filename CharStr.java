import java.io.*;
public class CharStr
{
public static void main(String[] args) throws	IOException
{
FileReader fr=new FileReader("Login.java");
FileWriter fw=new FileWriter("F4.java");
int n;
while((n=fr.read())!=-1)
{
fw.write(n);
}
fw.close();
}


}
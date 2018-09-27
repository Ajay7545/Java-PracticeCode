import java.util.*;
public class ScanEx
{
public static void main(String[] args) 
{
	System.out.println("Enter Name and Age of Student");
	Scanner sc=new Scanner(System.in);
	String name=sc.nextLine();
	int age=sc.nextInt();
	
	System.out.println("Name="+name+" \n Age:"+age);
}

}
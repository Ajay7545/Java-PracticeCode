import java.util.*;

public class array
{
	public static void main(String[] args)
	{
		
	
	Scanner sc=new Scanner(System.in);
	int i;
	int arr[]=new int[5];

	for(i=0;i<5;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	for(i=0;i<5;i++)
	{
	System.out.println("the array is arr["+i+"]="+arr[i]);
	}

 	}
}
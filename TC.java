import java.io.*;

public class TC
{
	void check(int n) 
{ try	
	{

		if(n==13)
			{throw new IOException();}
	
	else
		{System.out.println("Num="+n);}
	}

catch(IOException ie)

	{
		//System.out.println(ie);
		ie.printStackTrace();
	}
}
}


class Main
{
	public static void main(String[] args)
	{
		TC t= new TC();
		t.check(10);
		t.check(20);
		t.check(13);
		t.check(4);
		t.check(7);
	}
}

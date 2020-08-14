

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    try{
	    Scanner obj1=new Scanner(System.in);
	    
	    int t=obj1.nextInt();
	    
	    while(t>0)
		{
		    String name=obj1.next();
		    int num=obj1.nextInt();
	    
		System.out.println("The input string :"+name);
	    System.out.println("The input integer :"+num);
		t--;    
		}
	    }
	    catch(Exception e)
	    {//
	    }
	    
	}
}
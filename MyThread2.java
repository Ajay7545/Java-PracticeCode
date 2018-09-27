public class MyThread2 extends Thread
{
	//synchronized public void run()
	public void run()
	{
	try
	{

		for(int i=1;i<=5;i++)
		{
		Thread t=Thread.currentThread();
		String s=t.getName();
		System.out.println(s+" "+i);
		Thread.sleep(1000); //throw InterruptedException(); 
		}
	}

		
		catch(InterruptedException ie)
		{ie.printStackTrace();}
	}

}


class Main  
{public static void main(String[] args) throws InterruptedException
{
	MyThread2 m=new MyThread2(); // m= refrence of a classs which is 
	Thread t1=new Thread(m);      
	Thread t2=new Thread(m,"Two");
	Thread t3=new  Thread(m,"Three");
	t1.setName("One");
	t2.setPriority(10);
		//by using synchronized this is executing in sequence
	t1.start(); //t1 t2 t3 are Runnable
	t1.join();
	t2.start();
	t3.start();
}
}
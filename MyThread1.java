public class MyThread1 implements Runnable
{
	public void run()
	{
		Thread t= Thread.currentThread();
		String s=t.getName();
		int p=t.getPriority();

		ThreadGroup tg=t.getThreadGroup();
		System.out.println("Name="+s);
		System.out.println("Priority=" +p+" "+s);
		System.out.println("Group="+tg+" "+s);
	}
}
class Main  
{public static void main(String[] args)
{
	MyThread1 m=new MyThread1(); // m= refrence of a classs which is 
	Thread t1=new Thread(m);      
	Thread t2=new Thread(m,"Two");
	Thread t3=new  Thread(m,"Three");
	t1.setName("One");
	t2.setPriority(10);

	t1.start(); //t1 t2 t3 are Runnable
	t2.start();
	t3.start();	
}
}
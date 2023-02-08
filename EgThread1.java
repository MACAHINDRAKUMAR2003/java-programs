class EgThread1 extends Thread
{
	public void run()
	{
		System.out.println("Thread is Executed by extend class");
	}
	public static void main(String args[])
	{
		EgThread1 t=new EgThread1();
		t.start();
	}
	
}
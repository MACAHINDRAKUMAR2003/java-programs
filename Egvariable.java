class Egvariable
{
	int b=115;
	int  c;
	static int d=2;
	public static void main(String arg[]) 
	{
	int a=12;
	System.out.println(a);
	Egvariable e=new Egvariable();
	System.out.println(e.b);
	System.out.println(e.d);
	System.out.println(e.c=a+e.b);
	}
}

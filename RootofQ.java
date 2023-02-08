import java.util.Scanner;
class RootofQ
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value;");
	 	double a=sc.nextDouble();
		System.out.println("enter b value;");
		double b=sc.nextDouble();
		System.out.println("enter c value;");
		double c=sc.nextDouble();
		double x=b*b-4.0*a*c;
		if(x==0.0)
		{
			double d=b/(2.0*a);
			System.out.println("the roots are:"+d);
		}
		else if(x>0.0)
		{
			double d=-b+(Math.sqrt(x));
			double f=-b-(Math.sqrt(x));
			System.out.println("the roots are:"+d);
		}
		else
		{
			System.out.println("the roots are imaginary values");
		}
	}
}


		


class ExException
{
public static void main(String args[])
{
try
{
int a=20,b=0,c=0;
c=a/b;
System.out.println("the division is:"+c);
}
catch(ArithmeticException e1)
{
System.out.println("the error is "+e1);
}

try
{
String s=null;
System.out.println(s.length());
}
catch(NullPointerException e2)
{
System.out.println("tht error is"+e2);
}
}
}

